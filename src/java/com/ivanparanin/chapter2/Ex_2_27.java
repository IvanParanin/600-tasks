package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_27 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = 1000;
        int c = a / b;
        System.out.println("Масса тела в " + a + " граммах равна " + c + " килограмм.");

    }
}
