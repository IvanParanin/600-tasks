package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_50 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Вводимое число " + x);
        int f, g;
        f = x / 10;
        g = x % 10;
        x = f + g;
        System.out.println("Его цифры " + f + " " + g + " сумма цифр " + x);
        for(int i = 1000; i <= 9999; i++) {
            int a, b, c, d, m, n;
            a = i / 1000; // 1
            b = (i / 100) % 10; // 2
            c = ((i % 1000) / 10) % 10; // 3
            d = i % 10; // 4
            m = a + b;
            n = c + d;
            if(m == x && n == x)
                System.out.print(i + " ");
        }
    }
}
