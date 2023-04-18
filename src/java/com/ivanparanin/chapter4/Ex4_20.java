package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_20 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = a / 100;
        c = a % 100;
        d = (c * 10) + b;
        System.out.println(d);
    }
}
