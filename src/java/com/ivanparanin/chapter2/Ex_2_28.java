package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_28 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c, d = 185.2;
        a = reader.nextDouble();
        b = a * d;
        d /= 1000;
        c = a * d;
        System.out.println("Расстояние в метрах: " + b);
        System.out.println("Растояние в километрах: " + c);

    }
}
