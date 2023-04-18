package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_18 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int i = 2;
        int x = 3;
        System.out.println("Число в квадрате: " + Math.pow(a , i) + " & " + "Число в кубе: " + Math.pow(a, x));
    }
}
