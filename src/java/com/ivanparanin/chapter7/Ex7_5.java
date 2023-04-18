package com.ivanparanin.chapter7;

import java.util.Scanner;

class Ex7_5 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a > 0)
            System.out.println('+');
        else
            System.out.println('-');
    }
}