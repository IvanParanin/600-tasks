package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_15 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = a / 10;
        c = a % 10;
        if(b > c)
            System.out.println("Первая цифра больше");
        if(b < c)
            System.out.println("Вторая цифра больше");
    }
}
