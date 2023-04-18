package com.ivanparanin.chapter8;

import java.util.Scanner;
public class Ex8_9 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c;
        if (a % 2 != 1) {
            b = a / 2;
            c = (a + b) % 10;
            System.out.println(a + b + c);
        } else {
            b = a / 2 + 1;
            c = (a * b) % 10;
            System.out.println(c - a - b);  // TODO
        }
    }
}
