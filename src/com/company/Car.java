package com.company;

public class Car {
    private String mark_name;
    private String year_prod;
    private Body body;


    public String getMark_name() {
        return mark_name;
    }

    public void setMark_name(String mark_name) {
        this.mark_name = mark_name;
    }

    public String getYear_prod() {
        return year_prod;
    }

    public void setYear_prod(String year_prod) {
        this.year_prod = year_prod;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }



    public Car(String mark_name, String year_prod, Body body) {
        this.mark_name = mark_name;
        this.year_prod = year_prod;
        this.body = body;

    }

    @Override
    public String toString() {
        return "Машина{" +
                "Марка='" + mark_name + '\'' +
                ", Год випуска='" + year_prod + '\'' +
                ", Корпус=" + body +
                '}';
    }
}
