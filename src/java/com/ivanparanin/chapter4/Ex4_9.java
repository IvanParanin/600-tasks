package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_9 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i, a, b, c;
        i = reader.nextInt();
        a = i / 10;
        b = i % 10;
        c = a + b;
        System.out.println(c);
    }
}
