package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_9 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a10, b100, c1000, all;
        a10 = reader.nextInt();
        b100 = reader.nextInt();
        c1000 = reader.nextInt();
        all = a10 * 10 + b100 * 100 + c1000 * 1000;
        System.out.println(all);
    }
}