package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_7 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a >= 100)
            a -= 1;
        System.out.println(a);
    }
}