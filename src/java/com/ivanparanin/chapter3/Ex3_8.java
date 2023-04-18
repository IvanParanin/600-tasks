package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a = reader.nextDouble();
        double h = reader.nextDouble();
        double P, S, c;
        S = (1 / 2) * (a * h); // TODO
        c = (a / 2);
        P = a + 2 * c;
        System.out.println("Площадь: " + S + "\n Периметр: " + P);
    }
}