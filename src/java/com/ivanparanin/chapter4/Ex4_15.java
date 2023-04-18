package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_15 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f = 0;
        a = reader.nextInt();
        b = a / 1000;
        c = (a % 1000) / 100;
        d = (a % 100) / 10;
        e = a % 10;
        if((b % 2) == 0) {
            f++;
        } if((c % 2) == 0)
            f++;
        if((d % 2) == 0) {
            f++;
        } if((e % 2) == 0) {
            f++;
        }
        System.out.println(f);
    }
}
