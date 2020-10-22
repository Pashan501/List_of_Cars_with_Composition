package com.company;

public class Engine {
    private String name;
    private int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public void engineOn(){
        System.out.println("Engine turning on...");
    }
    public void engineOff(){
        System.out.println("Engine turning of...");
    }

    @Override
    public String toString() {
        return "Двигатель{" +
                "Название='" + name + '\'' +
                ", Мощность=" + power +
                '}';
    }
}
