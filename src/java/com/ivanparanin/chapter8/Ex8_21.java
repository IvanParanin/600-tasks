package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_21 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = a % 10;
        if(b < 5)
            c = (a / 10) * 10;
        else
            c = (a / 10 + 1) * 10;
        System.out.println(c);
    }
}

