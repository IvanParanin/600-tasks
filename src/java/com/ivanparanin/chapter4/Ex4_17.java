package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_17 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = reader.nextInt();
        b = a / 1000;
        c = (a % 1000) / 100;
        d = (a % 100) / 10;
        e = a % 10;
        f = (e * 1000) + (d * 100) + (c * 10) + b;
        System.out.println(f);
    }
}
