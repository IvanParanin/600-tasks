package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_23 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = a % 10;
        c = a / 10;
        d = (b * 1000) + c;
        System.out.println(d);
    }
}