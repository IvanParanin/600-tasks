package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_49 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Вводимое число " + x);
        for(int i = 1000; i <= 9999; i++) {
            int a, b, c;
            a = i / 100;
            b = (i / 10) % 100;
            c = i % 100;
            if(x == a || x == b || x == c)
                System.out.print(i + " ");

        }
    }
}
