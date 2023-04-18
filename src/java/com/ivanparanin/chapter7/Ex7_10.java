package com.ivanparanin.chapter7;

import java.util.Scanner;

class Ex7_10 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = reader.nextInt();
        if (a < 0) {
            a *= -1;
            System.out.println(a);
        }
        if (a > 0) {
            a = 0;
            System.out.println(a);
        }
    }
}