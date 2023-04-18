package com.ivanparanin.chapter9;

import java.util.Scanner;

class Ex9_5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        for (int i = 1; i < 3; i++) {
            System.out.println(i + "этаж");
            if (a > (a - 1) || a < (a + 1)) {
                System.out.println("По центру");
            }
            if (a > a - 1) {
                System.out.println("Справа"); // TODO
            } else
                System.out.println("Слева");
        }
    }
}
