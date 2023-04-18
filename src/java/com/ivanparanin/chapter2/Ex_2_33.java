package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_33 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, h, s;
        a = reader.nextInt();
        b = reader.nextInt();
        h = reader.nextInt();
        s = ((a * h) / 2) * h;
        System.out.println("Площадь трапеции: " + s);
    }
}
