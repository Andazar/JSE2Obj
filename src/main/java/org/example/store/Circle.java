package org.example.store;

public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
 //Конструктор
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    public double getCircSqeare()
    {
        double s;

        s = Math.round(Math.PI*Math.pow(r,2));

        return s;
    }
}
