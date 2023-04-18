package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_32 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, d;
        a = reader.nextInt();
        if(a % 2 == 0) {
            d = reader.nextDouble();
            a = a * d;
            System.out.println(a);
        } if(a % 2 != 0) {
            b = reader.nextInt();
            a += b;
            System.out.println(a);
        }
    }
}
