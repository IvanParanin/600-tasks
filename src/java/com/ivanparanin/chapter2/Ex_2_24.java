package com.ivanparanin.chapter2;

import java.util.Scanner;
public class Ex_2_24 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y, z, P, S;
        x = reader.nextInt();
        y = reader.nextInt();
        //z = reader.nextInt();
        P = (x + y) * 2;
        S = (x * y);
        System.out.println("Периметр прямоугольника: " + P);
        System.out.println("Площадь прямоугольника: " + S);


    }
}
