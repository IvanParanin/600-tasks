package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_10 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i, a, b, c, d;
        i = reader.nextInt();
        a = i / 100;
        b = (i % 100) / 10;
        c = i % 10;
        d = a + b + c;
        System.out.println(d);
    }
}