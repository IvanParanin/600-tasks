package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_28 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if (a / b == 0) {
            System.out.println("Правильная дробь");
        }
        if (a / b != 0) {
            System.out.println("Неправильная дробь");
        }
    }
}