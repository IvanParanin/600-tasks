package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_55 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int m, n;
        m = reader.nextInt();
        n = reader.nextInt();
        if(m < n) {
            System.out.println("Если первое меньше ");
            for (int i = m; i < n; i++) {
                if(i % 2 == 0)
                    System.out.println(i);
            }
        }else if (m > n) {
            System.out.println("Если первое больше ");
            for (int i = m; i > n; i--) {
                if(i % 2 == 0)
                    System.out.println(i);
            }
        }else
            System.out.println("Ошибка");
    }
}
