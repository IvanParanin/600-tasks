package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_28 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Начало");
        for(int i = 100; i <= 999; i++) {
            int a, b, c;
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if(a + b + c == x)
                System.out.print(i);
        }
        System.out.println("\nЗавершение");
    }
}
