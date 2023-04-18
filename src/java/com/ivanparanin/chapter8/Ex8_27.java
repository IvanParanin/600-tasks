package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_27 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        a = a % 10;
        b = b % 10;
        if (a > b) {
            System.out.println(a);
        }
        if (a < b) {
            System.out.println(b);
        } if (a == b) {
            System.out.println("Равны");
        }
    }
}
