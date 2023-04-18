package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_19 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f, g;
        a = reader.nextInt();
        b = a / 1000; // b = a / 100;
        c = (a % 1000) / 100; // c = a % 100;
        //d = (a / 100) / 10;
        //e = a % 10;
        //f = b + c;  // TODO решить
        //g = d + e;
        if(b == c)
            System.out.println("Парно-симметричные");
        else
            System.out.println("No");
    }
}

