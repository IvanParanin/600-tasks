package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_14 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = a / b;
        if(c > 0)
            System.out.println('+');
        if(c < 0)
            System.out.println('-');
    }
}
