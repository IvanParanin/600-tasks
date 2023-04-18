package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_16 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        e = (d * 100) + (c * 10) + b;
        System.out.println(e);
    }
}
