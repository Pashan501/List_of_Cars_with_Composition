package com.company;

public class Transmission {
  private Wheel wheel_01,wheel_02,wheel_03,wheel_04;

    public Transmission(Wheel wheel_01, Wheel wheel_02, Wheel wheel_03, Wheel wheel_04) {
        this.wheel_01 = wheel_01;
        this.wheel_02 = wheel_02;
        this.wheel_03 = wheel_03;
        this.wheel_04 = wheel_04;
    }


    @Override
    public String toString() {
        return "Transmission{" +
                "wheel_01=" + wheel_01 +
                ", wheel_02=" + wheel_02 +
                ", wheel_03=" + wheel_03 +
                ", wheel_04=" + wheel_04 +
                '}';
    }
}
