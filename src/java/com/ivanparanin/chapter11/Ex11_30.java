package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_30 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Начало");
        for(int i = 10; i <= 99; i++) {
            int a, b;
            a = i / 10;
            b = i % 10;
            if((a * b) < x)
                System.out.print(i + " ");
        }
        System.out.println("\nЗавершение");
    }
}
