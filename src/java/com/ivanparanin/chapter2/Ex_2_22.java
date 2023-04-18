package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_22 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a + b;
        d = a * b;
        e = a - b;
        f = b - a;
        System.out.println("Сумма чисел: " + c);
        System.out.println("Произведение чисел: " + d);
        System.out.println("Разность между первым и вторым: " + e);
        System.out.println("Разность между вторым и первым: " + f);


    }

}
