package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_19 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a > 0 && a != b)
            System.out.println("Прямоугольник");
        if(a == b)
            System.out.println("Квадрат");
        else
            System.out.println("Ошибка");
    }
}
