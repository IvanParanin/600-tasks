package com.ivanparanin.chapter7;
import java.util.Scanner;
public class Ex7_3 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a % 3 == b % 4)
            System.out.println(a - b);
        else
            System.out.println(b - a);

    }
}
