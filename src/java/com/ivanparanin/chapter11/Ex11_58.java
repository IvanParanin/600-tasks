package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_58 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = reader.nextInt();
            if(a > 0) {
                a *= a;
                System.out.println(a);
            }
            else
                System.out.println("Пропускаем");
        }
    }
}

