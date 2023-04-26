package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_23 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        a = b * c * d;
        e = b + c + d;
        if((a % 2) == 0 && (e % 2) == 0)
            System.out.println("Число дважды четное");
        else
            System.out.println("Число нечетное");
    }
}
