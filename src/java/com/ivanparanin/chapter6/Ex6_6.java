package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a > 0)
            System.out.println('+');
        if(a == 0)
            System.out.println("0");
        if(a < 0)
            System.out.println('-');
    }
}
