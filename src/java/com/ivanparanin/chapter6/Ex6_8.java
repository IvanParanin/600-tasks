package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a > b)
            a += b;
        System.out.println(a);
        if(a < b)
            a *= b;
        System.out.println(a);
        if(a == b)
            System.out.println("Числа равны");
    }
}
