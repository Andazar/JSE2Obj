package org.example;

public class Truck extends Transport {
    int engPower;
    int countWheels;

    public Truck(String newModel, int newSpeed, int newWeightLif, int newPriceKm, int engPower, int countWheels) {
        super(newModel, newSpeed, newWeightLif, newPriceKm);
        this.engPower = engPower;
        this.countWheels = countWheels;
    }

    @Override
    String abstractGo(int km) {
        int h = km/speed;
        return "Проехать " + km + "км. займет " + h + "ч.";
    }



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
