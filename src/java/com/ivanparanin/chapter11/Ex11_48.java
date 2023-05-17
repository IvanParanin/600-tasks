package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_48 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Вводимое число " + x);
        for(int i = 100; i <= 999; i++) {
            int a, b;
            a = i / 10;
            b = i % 100;
            if(x == a || x == b)
                System.out.print(i + " ");
        }
    }
}
