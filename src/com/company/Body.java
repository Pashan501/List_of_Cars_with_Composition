package com.company;

public class Body {
    private Transmission transmission;
    private  Engine engine;


    public Body(Transmission transmission, Engine engine) {
        this.transmission = transmission;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Корпус{" +
                "Трансмиссия=" + transmission +
                ", Двигатель=" + engine +
                '}';
    }
}
