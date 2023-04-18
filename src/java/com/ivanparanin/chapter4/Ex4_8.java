package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i, a, b, c, d;
        i = reader.nextInt();
        a = i % 10;
        b = (i % 100) / 10;
        c = i / 100;
        d = ((a * 100) + (b * 10) + c) - 20;
        System.out.println(d);

    }
}