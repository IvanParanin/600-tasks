package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_26 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a / 100;
        d = (a / 10) % 100;
        e = a % 100;
        if(b == c || b == d || b == e)
            System.out.println("Есть четные пары");
        else
            System.out.println("Нет четных пар");
    }
}
