package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_32 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a >= 1900 && a < 2000) {
            if((a % 4) == 0)
            System.out.println("Високосный год");
            else
                System.out.println("Нет");
        }
        else
            System.out.println("Ошибка");
    }
}
