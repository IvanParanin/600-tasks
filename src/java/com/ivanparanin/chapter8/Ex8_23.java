package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_23 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if (a > b) {
            a += 1;
            b -= 1;
            System.out.println(a + " " + b);
        }
        if (a < b) {
            a -= 1;
            b += 1;
            System.out.println(a + " " + b);
        } else {
            a += 1;
            b += 1;
            System.out.println(a + " " + b);
        }
    }
}

