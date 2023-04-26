package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_28 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e = 0;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if (b == c) {
            e++;
        } if (b == d) { // TODO не срабатывает на 3 одинаковых числа
            e++;
        } if (c == d) {
            e++;
        } else {
            System.out.println("Не содержит одинаковых чисел");
        }
        System.out.println("Содержит " + e + " одинаковых числа");
    }
}
