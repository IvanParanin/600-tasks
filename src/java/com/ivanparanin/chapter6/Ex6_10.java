package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_10 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = a / 10;
        c = a % 10;
        d = b * c;
        if(a > d)
            System.out.println("Число больше");
        if(a < b)
            System.out.println("Произведение больше");
    }
}