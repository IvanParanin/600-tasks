package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_27 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Начало");
        for(int i = 10; i <= 99; i++) {
            int b, c;
            b = i / 10;
            c = i % 10;
            if(c + b == x)
                System.out.println(i + " ");
        }
        System.out.println("\nЗавершение");
    }
}
