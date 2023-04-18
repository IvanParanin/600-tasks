package com.ivanparanin.chapter7;

import java.util.Scanner;

class Ex7_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = reader.nextInt();
        c = b * 2;
        if (a == c)
            System.out.println("Парт хвататет");
        else
            System.out.println("Парт не хватает");
    }
}
