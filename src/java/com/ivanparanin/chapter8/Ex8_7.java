package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_7 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a > b) {
            a -= b;
            System.out.println(a);
        }
        else if(a < b) {
            b -= a;
            System.out.println(b);
        }
        else {
            a *= b;
            System.out.println(a);
        }
    }
}