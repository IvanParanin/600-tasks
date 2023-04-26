package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_30 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e = 0;
        a = reader.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        if (b != 0 && c != 0 && d != 0) {
            if ((b % c) == 0) {
                e++;
            }
            if ((b % d) == 0) {
                e++;
            }
            if ((c % d) == 0) {
                e++;
            }
            if ((d % b) == 0) {
                e++;
            }
            if ((d % c) == 0) {
                e++;
            }
            if ((c % b) == 0) {
                e++;
            }
            System.out.println(e + " вариантнов деления без остатка");
        } else {
            System.out.println("Ошибка");
        }
    }
}

