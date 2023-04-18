package com.ivanparanin.chapter2;
import java.util.Scanner;

public class Ex_2_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите значение");
        int a = reader.nextInt();
        System.out.print("Результаты введенного вами значения: ");
        System.out.print("\t" + (a));
        System.out.print("\t" + (a + 1));
        System.out.print("\t" + (a - 2));
    }

    }