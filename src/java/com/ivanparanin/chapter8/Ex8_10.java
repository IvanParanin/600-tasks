package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_10 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        if (a < 0) {
            a *= a;
            System.out.println(a);
        } else {
            System.out.println("Ошибка");
        }
    }
}

