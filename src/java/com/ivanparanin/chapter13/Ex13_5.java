package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_5 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int x = reader.nextInt();
        for(int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println("База от числа " + x + " = " +  sum);
    }
}
