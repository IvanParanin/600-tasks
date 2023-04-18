package com.ivanparanin.chapter8;
import java.util.Scanner;
public class Ex8_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = a / 2 + b / 2;
        if(a + b != c) {
            c = (a / 2) + (b / 2);
            System.out.println("C = " + c);
        }
        else {
            c = (a % 2) + (b % 2);
            System.out.println("C is " + c);
        }

    }
}
