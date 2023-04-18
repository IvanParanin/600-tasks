package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_14 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e = 0;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if((b / 2) == 0) {
            e++;
        } if((c / 2) == 0) {
            e++;
        } if((d / 2) == 0) {
            e++;
        }
        System.out.println(e);
    }
}