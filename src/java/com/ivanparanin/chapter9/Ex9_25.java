package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_25 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if(c < b && c < d)
            System.out.println("Средняя цифра меньше");
        else
            System.out.println("Ошибка");
    }
}
