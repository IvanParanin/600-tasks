package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_29 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e = 0;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if(b != c) {
            e++;
        }
        if(b != d) {
            e++;
        }
        if (c != d) {
            e++;
        } else {
            System.out.println("Нет разных чисел");
        }
        System.out.println(e);
    }
}
