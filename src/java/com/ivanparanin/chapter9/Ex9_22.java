package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_22 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, a1000, a500, a200, a100;
        a = reader.nextInt();
       /* a100 = a / 100;
        a50 = (a - a100 * 100) / 50;
        a10 = (a - a100 * 100 - a50 * 50) / 10;
        if((a100 * 100 + a50 * 50 + a10 * 10) == a)
            System.out.println(a100 + " по 100 " + a50 + " по 50 " + a10 + " по 10");
        else
            System.out.println("Нельзя");

        */
        a1000 = a / 1000;
        a500 = (a - (a1000 * 1000)) / 500;
        a200 = (a - (a1000 * 1000) - (a500 * 500)) / 200;
        a100 = (a - (a1000 * 1000) - (a500 * 500) - (a200 * 200)) / 100;
        if((a1000 * 1000) + (a500 * 500) + (a200 * 200) + (a100 * 100) == a)
            System.out.println(a1000 + " по 1000 " + a500 + " по 500 " + a200 + " по 200 " + a100 + " по 100");
        else
            System.out.println("Нельзя");
    }
}
