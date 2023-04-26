package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_33 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c = 0;
        a = reader.nextInt();
        b = reader.nextInt();
        if ((a % b) == 0)
            System.out.println("Правильная дробь");
        else
            System.out.println("Неправильная дробь");
        }
    }

