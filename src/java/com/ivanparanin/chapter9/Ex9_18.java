package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_18 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        if((a + b) > c && (b + c) > a && (a + c) > b)
            System.out.println("Являются сторонами одного треугольника");
        else
            System.out.println("Ошибка");
    }
}
