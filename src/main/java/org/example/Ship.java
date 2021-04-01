package org.example;

public class Ship extends Transport {
    int draught;
    int length;

    //speed =1;

    @Override
    String abstractGo(int km) {
        int h = km/speed;
        return "Проплыть расстояние в " + km + "км. займет " + h + "ч.";
    }


    public void sail() {
        System.out.println("Я плыву");}

    public int getDraught() {
        return draught;
    }

    public void setDraught(int draught) {
        this.draught = draught;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



}
