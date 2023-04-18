package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_11 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a > b) {
            a -= b;
            System.out.println("Не хватает стульев " + a);
        }
        if(a < b) {
            b -= a;
            System.out.println("Лишние стулья " + b);
        }
        else
            System.out.println("Всего хватает");
    }
}