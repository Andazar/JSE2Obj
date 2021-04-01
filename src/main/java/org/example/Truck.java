package org.example;

public class Truck extends Transport {
    int engPower;
    int countWheels;


    public void ride() {
        System.out.println("Я еду");}

    public int getEngPower() {
        return engPower;
    }

    public void setEngPower(int engPower) {
        this.engPower = engPower;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }
}
