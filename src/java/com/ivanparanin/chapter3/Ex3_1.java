package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_1 {

    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int F = reader.nextInt();
        int C;
        C = 5 *(F - 32) / 9;
        System.out.println("Это будет " + C + " градусов Цельсия");
    }
}
