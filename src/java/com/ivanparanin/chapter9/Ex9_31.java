package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_31 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a >= 1500 && a < 1600)
            System.out.println("16 век");
        else if(a >= 1600 && a < 1700)
            System.out.println("17 век");
        else if(a >= 1700 && a < 1800)
            System.out.println("18 век");
        else if(a >= 1800 && a < 1900)
            System.out.println("19 век");
        else if(a >= 1900 && a < 2000)
            System.out.println("20 век");
        else
            System.out.println("Ошибка");
        /*
        if(a / 100 >= 15 && a / 100 <= 19)
           System.out.println(a / 100 + 1 + " -й век");
        else
           System.out.println("Нет");
         */
    }
}
