package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, i, d;
        i = reader.nextInt();
        a = i % 10;
        b = i % 100;
        c = i - b;
        d = b - a;
        System.out.println(c + "+" + d + "+" + a);
    }
}
