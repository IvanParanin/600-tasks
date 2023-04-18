package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_2 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double num; // 8, -9, 0,4
        System.out.println("enter double");
        num = reader.nextDouble();
        if(num > 0) {
            System.out.println("Положительное число"); // 8, 4
            System.out.println("Завершено"); // -9, 0,
        }
    }
}