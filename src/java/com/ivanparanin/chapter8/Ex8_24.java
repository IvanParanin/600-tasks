package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_24 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if (a > 500) {
            e = (d * 100) + (c * 10) + b;
            System.out.println(e);

        } else {
            f = (b * 100) + (d * 10) + c;
            System.out.println(f);
        }
    }
}