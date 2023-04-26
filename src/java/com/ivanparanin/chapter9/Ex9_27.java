package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_27 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e, f = 0;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a / 100;
        d = (a / 10) % 100;
        e = a % 100;
        if (b == c) {
            f++;
        }
        else if (b == d) {
            f++;
        }
        else if (b == e) {
            f++;
        } else {
            System.out.println("Нет четных пар");
        }
        System.out.println(f + " раз/а");

    }
}
