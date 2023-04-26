package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_16 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a = reader.nextDouble();
        if(a >= 6.00 && a < 10.00)
            System.out.println("Утреннее время суток");
        else if(a > 10.00 && a <= 18.00)
            System.out.println("Дневное время суток");
        else if(a > 18.00 && a <= 22.00)
            System.out.println("Вечернее время суток");
        else if(a > 22.00 && a <= 24 || a < 6.00)
            System.out.println("Ночное время суток");
        else
            System.out.println("Ошибка");
    }
}
