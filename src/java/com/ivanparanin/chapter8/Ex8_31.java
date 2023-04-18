package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_31 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, a1;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if(a / 2 == 0) {
            if(b / 2 == 0) {
                b += 1;
            } else {
                b -= 1;
            } if(c / 2 == 0) {
                c += 1;
            } else {
                c-= 1;
            } if(d / 2 == 0) {
                d += 1;
            } else {
                d -= 1;
            }
            a = (b * 100) + (c * 10) + d;
            System.out.println(a);
        }
        if(a / 2 != 0) {
            if(b / 2 == 0) {
                b -= 1;
            } else {
                b += 1;
            } if(c / 2 == 0) {
                c -= 1;
            } else {
                c += 1;
            } if(d / 2 == 0) {
                d -= 1;
            } else {
                d += 1;
            }
            a1 = (b * 100) + (c * 10) + d;
            System.out.println(a1);
        }
    }
}