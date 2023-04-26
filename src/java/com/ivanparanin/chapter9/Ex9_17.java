package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_17 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        if(a > 0 && a < 180)
            System.out.println("a может являться");
        if(b > 0 && b < 180)
            System.out.println("b может являться");
        if(c > 0 && c < 180)
            System.out.println("c может являться");
        int d = a + b + c;
        if(d != 180)
            System.out.println("Не являются углами одного треугольника");
    }
}
