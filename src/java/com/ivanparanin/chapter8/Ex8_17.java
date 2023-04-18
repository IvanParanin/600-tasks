package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_17 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, f;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        f = b + c + d;
        if((a / 2 & f / 2) == 0)
            System.out.println("Дважды четное");
        else
            System.out.println("Нет");
    }
}
