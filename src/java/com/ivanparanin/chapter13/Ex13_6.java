package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int x = reader.nextInt();
        System.out.println("Число " + x);
        for(int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if (sum == x)
            System.out.println("Удивительное число");
        else
            System.out.println("Не является удивительным");
    }
}
