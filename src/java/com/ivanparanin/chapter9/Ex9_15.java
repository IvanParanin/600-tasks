package com.ivanparanin.chapter9;
import java.util.Scanner;

public class Ex9_15 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a <= 0 || a >= 13)
            System.out.println("Это нто не месяц");
        if(a >= 1 && a <=2 || a == 12)
            System.out.println("Зима");
        if(a >= 3 && a <= 5)
            System.out.println("Весна");
        if(a >= 6 && a <= 8)
            System.out.println("Лето");
        if(a >= 9 && a <= 11)
            System.out.println("Осень");
    }
}
