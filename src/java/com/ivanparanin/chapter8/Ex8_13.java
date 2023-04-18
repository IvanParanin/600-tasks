package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_13 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = a / 10;
        c = a % 10;
        if(b == c)
            System.out.println("Цифры одинаковые");
        else
            System.out.println("Цифры разные");
    }
}

