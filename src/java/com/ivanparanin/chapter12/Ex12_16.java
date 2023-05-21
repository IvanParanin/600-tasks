package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_16 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int x = reader.nextInt();
        for(int i = 1; i <= x; i++) {
            if(x % i == 0 && x % x == 0) {
                count++;
            }

        }
        if(count == 2)
            System.out.println("Простое число");
        else
            System.out.println("Нет");
    }
}
