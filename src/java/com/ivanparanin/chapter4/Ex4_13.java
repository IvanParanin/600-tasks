package com.ivanparanin.chapter4;


import java.util.Scanner;

class Ex4_13 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d = 0;
        a = reader.nextInt();
        b = a / 10;
        c = a % 10;
        if((b % 2) == 0)
            d++;
        if((c % 2) == 0)
            d++;
        System.out.println(d);
    }
}