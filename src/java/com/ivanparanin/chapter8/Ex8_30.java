package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_30 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a > b)
            System.out.println(a / b);
        else
            System.out.println("Подсчет не производится");
    }
}
