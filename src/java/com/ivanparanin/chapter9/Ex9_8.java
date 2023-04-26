package com.ivanparanin.chapter9;
import java.util.Scanner;

public class Ex9_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, j;
        a = reader.nextInt();
        b = a / 100000;
        c = (a / 10000) % 10;
        d = (a / 1000) % 10;
        e = (a / 100) % 10;
        f = (a % 100) / 10;
        g = (a % 10);

        h = b + c + d;
        j = e + f + g;

        if((h % 2 == 0) && (j % 2 == 0))
            System.out.println("Счастливый билет");
        else
            System.out.println("Не является");
    }
}
