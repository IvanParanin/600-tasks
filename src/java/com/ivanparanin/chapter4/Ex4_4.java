package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_4 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i = reader.nextInt();
        int a, b, c;
        a = i / 100;
        b = (i % 100) / 10;
        c = i % 10;
        System.out.println(c + " " + b + " " + a);
    }
}