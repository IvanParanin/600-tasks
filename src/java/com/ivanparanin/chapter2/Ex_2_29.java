package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_29 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = a * 3600;
        System.out.println("Промежуток времени в секундах: " + b);
    }
}
