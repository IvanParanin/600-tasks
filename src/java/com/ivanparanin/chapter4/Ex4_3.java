package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_3 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = a / 10;
        c = a % 10;
        System.out.println(c + " " + b);
    }
}