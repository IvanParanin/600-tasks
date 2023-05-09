package com.ivanparanin.chapter11;

import java.util.Scanner;
public class Ex11_7 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, count = 0;
        a = reader.nextInt();
        b = reader.nextInt();
        System.out.println(a + " " + b);
        for (int i = 1; i <= 20; i++) {
            count = a + (int) (Math.random() * (b - a) + 1);
            System.out.println("Цикл: " + i + " " + count);

        }
    }
}
