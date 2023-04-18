package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_4 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int b,  a = reader.nextInt();
        if(a > 0) {
            b = a * 2;
            System.out.println(b);
        } else
            System.out.println('-');
    }
}
