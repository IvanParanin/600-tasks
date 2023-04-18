package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_25 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a % 10;
        a = a / 10;
        d = b % 10;
        b = b / 10;
        a = a * 10 + d;
        b = b * 10 + c;
        System.out.println(a + " " + b);
    }
}

