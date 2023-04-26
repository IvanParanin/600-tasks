package com.ivanparanin.chapter9;
import java.util.Scanner;

public class Ex9_9 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, x, i = 0;
        a = reader.nextInt();
        b = reader.nextInt();
       if(a == 0 && b == 0)
           System.out.println("Бесконечное множество");
       if(a == 0 && b != 0)
           System.out.println("Нет решения");
       if(a != 0)
           System.out.println(-b / a);
    }
}
