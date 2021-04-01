package org.example;

public class Ship extends Transport {
    int draught;
    int length;


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
