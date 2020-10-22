package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<Car>list = new ArrayList<>();

    Car car = new Car("Mercedes","2020", new Body(
            new Transmission(new Wheel(1,"lb"),new Wheel(2,"lb"),new Wheel(3,"lb"),new Wheel(4,"lb")),
            new Engine("Volvo V12",9000)));

        Car car2 = new Car("BMW","2015", new Body(
                new Transmission(new Wheel(1,"lb"),new Wheel(2,"lb"),new Wheel(3,"lb"),new Wheel(4,"lb")),
                new Engine("BMW V6",6000)));
        list.add(car);
        list.add(car2);
        for(Car a :list){
            System.out.println(a);
        }

    car.getBody().getEngine().engineOn();
        System.out.println(car.getMark_name()+" прогріла двигун...");
        car.getBody().getEngine().engineOff();


    }

}
