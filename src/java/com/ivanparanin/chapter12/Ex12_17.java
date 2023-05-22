package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_17 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int count1 = 0, count2 = 0, x, x1;
        x = reader.nextInt();
        x1 = reader.nextInt();
        if (x > x1) {
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    count1++;
            }
        } if (x < x1) {
            for (int i = 1; i <= x1; i++) {
                if (x1 % i == 0)
                    count2++;
            }
        }
        if(count1 == count2)
            System.out.println("Родственные");
        else
            System.out.println("Неродственные");
    }
}