package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_21 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = a / 1000;
        c = a % 1000;
        d = (c * 10) + b;
        System.out.println(d);
    }
}
