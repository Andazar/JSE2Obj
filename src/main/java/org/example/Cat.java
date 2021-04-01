package org.example;

public class Cat {
    String name;
    String breed;
    int weight;
    boolean isAngry;

    public Cat(String newName, String newBreed)
    {
        this.name = newName;
        this.breed = newBreed;
        //return new Cat;
    }

    public Cat(String newName, String newBreed, boolean newAngry)
    {
        this.name = newName;
        this.breed = newBreed;
        this.isAngry = newAngry;
    }
  //Геттер
    public String getName()
    {
        return name;
    }

    //Сеттер
    public void setName(String newName) {
        this.name = newName;
    }


    public void seyMeow(int count) {
       for(int i=0; i<count; i++)
       {
           System.out.println("Мяу!");
       };
    }





    //  String noResult(String param1, int param2)
    // {return '';    };
}
