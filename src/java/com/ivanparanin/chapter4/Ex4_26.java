package com.ivanparanin.chapter4;


import java.util.Scanner;

class Ex4_26 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a % 100;
        a = a / 100;
        d = b % 100;
        b = b / 100;
        a = a * 10 + d;
        b = b * 10 + c;
        System.out.println(a + " " + b);
    }
}

