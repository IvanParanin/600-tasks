package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_12 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        e = (b - d) / c;
        System.out.println(e);
    }
}
