package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_2 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double d = reader.nextDouble();
        double s = d * 2.54;
        System.out.println(s);
    }
}
