package org.example;

public class Transport {
    String model;
    int speed;
    int weightLif;
    int priceKm;

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", weightLif=" + weightLif +
                ", priceKm=" + priceKm +
                '}';
    }

    public Transport(String newModel, int newSpeed, int newWeightLif, int newPriceKm) {
        this.model = newModel;
        this.speed = newSpeed;
        this.weightLif = newWeightLif;
        this.priceKm = newPriceKm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeightLif() {
        return weightLif;
    }

    public void setWeight(int weightLif) {
        this.weightLif = weightLif;
    }

    public int getPriceKm() {
        return priceKm;
    }

    public void setPriceKm(int priceKm) {
        this.priceKm = priceKm;
    }


    public String calc(int kg, int km) {
        int price;
        int time;
        int OverLim = kg - weightLif;

        if (kg>weightLif)
        {
            return "Грузоподьемность превышена на " + OverLim + "кг";
        } else {
            price = priceKm * km;
            time = km/speed;

            return model + " перевезет " + kg +
                    "кг на расстояние " + km +
                    " за " + price + "р. за " + time+ " часов. ";
        }
    }
}
