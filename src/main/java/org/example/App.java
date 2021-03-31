package org.example;

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

        task1(140);
        task2(50,70);


    }

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


}
