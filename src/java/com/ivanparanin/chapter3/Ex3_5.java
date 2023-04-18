package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_5 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c, P, S;
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();
        P = a + b + c;
        S = (a * b) / 2;
        System.out.println("Периметр " + P);
        System.out.println("Площадь " + S );

    }
}