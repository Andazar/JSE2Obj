package org.example;

public class Tasks {
    String numStr;
    //String numStr2;

    public static String main(int par1)
    {
        //поиск простого числа
        String numStr = " ";
        for (int i = 2; i < par1; i++) {
            if (par1 % i == 0) {
                numStr = par1 + " - Не простое";
                break;
            } else {
                numStr = par1 + " - Простое";
            }
        }
        //System.out.println(numStr);
        return numStr; //Возвращаем без вывода

    }

    public String main2(int par1, int par2) {
        int f = 0;
        //int t = 0;
        String numStr = " ";
        String numStr2 = "Простые числа в диапазоне от "+ par1 +" до " +  par2 + ": ";
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
        //System.out.println(numStr2);
        return numStr2;
    }

    public static long fib(int num)// номер в последовательности
    {
        ///Числа Фибоначчи(Рекурсия)
        if (num <= 1)
        {return num;}
        else { return fib(num - 1) + fib(num - 2);}

     }
        //System.out.println(numStr);
        //return numStr; //Возвращаем без вывода

    public static long fib2(int num)// номер в последовательности
    {
        ///Числа Фибоначчи(Рекурсия)
        return num <= 1 ? num : fib2(num - 1) + fib2(num - 2);

    }

    }



