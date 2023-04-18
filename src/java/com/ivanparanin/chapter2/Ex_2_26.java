package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_26 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = b - a;
        System.out.println("Год рождения: " + a);
        System.out.println("Нынешний год: " + b);
        System.out.println("Нынешний возраст: " + c);
    }
}
