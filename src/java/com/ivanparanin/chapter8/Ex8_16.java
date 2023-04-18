package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_16 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = a / 100;
        c = a % 10;
        if(b == c)
            System.out.println("Одинаковые");
        else
            System.out.println("Не одинаковые");
    }
}

