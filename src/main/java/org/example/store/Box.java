package org.example.store;

public class Box {

    private int boxX;
    private int boxY;
    private int boxZ;


    public Box(int boxX, int boxY, int boxZ) throws MyBoxException {

        if (boxX < 0) {
            throw new MyBoxException("Высота не может быть отрицательной");
            //boxX = boxX * (-1);
        } else if (boxY < 0) {
            throw new MyBoxException("Длина не может быть отрицательной");
        } else if (boxZ < 0) {
            throw new MyBoxException("Глубина не может быть отрицательной");
        }

        this.boxX = boxX;
        this.boxY = boxY;
        this.boxZ = boxZ;
    }

    public int getBoxX() {
        return boxX;
    }

    public void setBoxX(int boxX) {
        this.boxX = boxX;
    }

    public int getBoxY() {
        return boxY;
    }

    public void setBoxY(int boxY) {
        this.boxY = boxY;
    }

    public int getBoxZ() {
        return boxZ;
    }

    public void setBoxZ(int boxZ) {
        this.boxZ = boxZ;
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxX=" + boxX +
                ", boxY=" + boxY +
                ", boxZ=" + boxZ +
                '}';
    }
}
