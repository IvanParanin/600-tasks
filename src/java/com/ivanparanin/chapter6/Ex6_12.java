package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_12 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        d = b * b - 4 * a * c;  // TODO
        if(d < 0)
            System.out.println("Да");
        else
            System.out.println("Нет");
    }
}

