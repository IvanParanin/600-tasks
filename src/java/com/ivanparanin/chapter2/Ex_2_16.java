package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_16 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println("Больше на 6 - " + (a + 6));
        System.out.println("Меньне на 12 - " + (a - 12));
    }
}
