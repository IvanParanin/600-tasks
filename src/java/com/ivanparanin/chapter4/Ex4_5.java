package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_5 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, i;
        i = reader.nextInt();
        a = i % 10;
        b = i - a;
        System.out.println(b + "+" + a);
    }
}