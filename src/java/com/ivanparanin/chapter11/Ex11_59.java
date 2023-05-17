package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_59 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        a = reader.nextInt();
        b = reader.nextInt();
        if(a < b) {
            for(int i = b + 1; i <= (b + a); i++) {
                System.out.println(i);
            }

        }else if (a > b) {
            for (int i = a + 1; i <= (a + b); i++)
                System.out.println(i);
        }else
            System.out.println("Ошибка");
    }
}
