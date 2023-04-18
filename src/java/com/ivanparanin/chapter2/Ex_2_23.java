package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_23 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a * a + b * b;
        System.out.println("Квадрат a: " + (a * a));
        System.out.println("Квадрат b: " + (b * b));
        System.out.println("Сумма чисел: " + (c));
    }
}
