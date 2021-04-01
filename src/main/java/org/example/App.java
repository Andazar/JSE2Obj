package org.example;

import org.example.DB.OracleConnector;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hi All!");

        String t1;
        String t2;
        long fib;
        long fib2;
        //Cat cat = new Cat();
        // cat.noResult("Мурзик",10);
        //Tasks task01 = new Tasks();
        //t1 = task01.main(110);

         //Метод static
        t1 = Tasks.main(7);

        //System.out.println(t1);
        //System.out.println(task01.main(111));
        System.out.println(t1);

        //Метод не static
        Tasks task02 = new Tasks();
        t2 = task02.main2(110,200);
        System.out.println(t2);

        //task1(140);
        //task2(50,70);

        //Метод рекурсия
        fib = Tasks.fib(6);
        System.out.println(fib);

        //Метод рекурсия тернарный
        fib2 = Tasks.fib2(30);
        System.out.println(fib2);

        //Computer myComp = new Computer();
        //myComp.getInfo();

        //Computer Comp1 = new Computer(100,10000, 1000, 512, 60);
        //myComp.getInfo();

        //Transport plane = new Transport("Самолет", 800, 200000, 400);
        //Transport ship = new Transport("Корабль", 80, 5000000, 100);
        //Transport truck = new Transport("Грузовик", 120, 20000, 200);

        int kg = 10000;
        int km = 2400;
        int heiKm = 8500;

        //System.out.println(plane.calc(kg, km));
        //System.out.println(ship.calc(kg, km));
        //System.out.println(truck.calc(kg, km));


       //Самалет
        Plane plane2 = new Plane("Боинг", 900, 230000, 380,9600,74);
        plane2.fly();
        //plane2.setWeight(1234);
        //plane2.setWingspan(74);

        System.out.println( plane2.getWeightLif());
        System.out.println( plane2.getWingspan());

        System.out.println(plane2.calc(kg, km, heiKm));

        //Корабль
        Ship ship2 = new Ship();
        //ship2.fly();
        ship2.sail();
        ship2.setModel("Титаник");
        ship2.setDraught(12);

        //System.out.println( ship2.getModel());
        //System.out.println( ship2.getDraught());
        //System.out.println( ship2.getWeightLif());

        //Грузовик
        Truck truck2 = new Truck("Volvo", 140, 23000, 180,420,14);
        truck2.ride();
        //truck2.sail();
        truck2.setEngPower(560);

        //System.out.println( truck2.getWeightLif());
        //System.out.println( truck2.getEngPower());

        /*System.out.println(plane2 instanceof Transport);
        System.out.println(ship2 instanceof Transport);
        System.out.println(truck2 instanceof Transport);
        System.out.println(ship instanceof Truck);*/

        Transport transport;
        int n = 6;
        if (n % 2 == 0)
        {
            transport = new Plane("Аэробус",900, 230000, 380,9600,74);
        }
        else
        {
            transport = new Truck("MEN",160, 28000, 190,600,18);;
        }

        //тип не приведен, используется метот из Transport а не из Plane
        System.out.println(transport.calc(kg, km));

        //Каст - приведение типа, при n - нечетном, будет эксепшн
        System.out.println( ((Plane)transport).calc(kg, km,heiKm) );

        System.out.println(transport.abstractGo(km));
        System.out.println(truck2.abstractGo(km));
        System.out.println(ship2.abstractGo(km));

        OracleConnector oraCon = new OracleConnector();
        System.out.println(oraCon.delete(6));

    }
/*
    static void task1(int par1) {
        //поиск простого числа
        String numStr = " ";
        for (int i = 2; i < par1; i++) {
            if (par1 % i == 0) {
                numStr = "Не простое";
                break;
            } else {
                numStr = "Простое";
            }
        }
        System.out.println(numStr);
        //return numStr;

    }

    static void task2(int par1, int par2) {
    int f = 0;
    //int t = 0;
    String numStr = " ";
    String numStr2 = "Простые числа: ";
    for( int j = par1; j<par2+1;j++)

    {
        for (int i = 2; i < j; i++) {
            if (j % i == 0) {
                numStr = j + ": Не простое число";
                f = 0;
                break;
            } else {
                numStr = j + ": Простое число";
                f = 1;
            }
        }
        //System.out.println(numStr);
        // Список всех простых
        if (f == 1) {
            numStr2 = numStr2 + j + ", ";
        } else {
            numStr2 = numStr2;
        }

    }
        System.out.println(numStr2);
}
*/

}
