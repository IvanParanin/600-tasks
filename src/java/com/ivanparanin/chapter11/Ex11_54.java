package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_54 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int m, n;
        m = reader.nextInt();
        n = reader.nextInt();
        if(m < n) {
            System.out.println("Если первое меньше ");
            for (int i = m + 1; i < n; i++)
                System.out.println(i);
        }else if (m > n) {
            System.out.println("Если первое больше ");
            for(int i = m - 1; i > n; i--)
                System.out.print(i);
        }else
            System.out.println("\nОшибка");
    }
}
