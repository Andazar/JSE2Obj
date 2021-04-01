package org.example;
//наследование
public class Plane extends Transport {
    int height;
    int wingspan;

    public Plane(String newModel, int newSpeed, int newWeightLif, int newPriceKm,
                 int height, int wingspan)
    {
        super(newModel, newSpeed, newWeightLif, newPriceKm);
        this.height = height;
        this.wingspan = wingspan;
    }


    public String calc(int kg, int km, int heiKm)
    {
        String OverHeig = "";
        String chPrice = "";

        if (8000/heiKm>1)
        { OverHeig = "Выстота полета ниже оптимальной на " + (8000-heiKm) + "м. ";
            chPrice = " Изменение стоимости: " + priceKm*(8000/heiKm)+ "руб. "; }
        else if (8000/heiKm<1)
        { OverHeig = "Выстота полета выше оптимальной на " + (heiKm-8000) + "м. ";
          chPrice = " Изменение стоимости: " + priceKm*(heiKm/8000)+ "руб. "; }
        else
        { OverHeig = "Выстота полета оптимальна. ";
            chPrice = " Стоимость оптимальна. "; }

        //String calc1 =
          return  OverHeig + " " + super.calc(kg, km) + " " +  chPrice;

    }

    public void fly() {
        System.out.println("Я лечу");}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

}
