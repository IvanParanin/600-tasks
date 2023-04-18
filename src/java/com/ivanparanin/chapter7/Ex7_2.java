package com.ivanparanin.chapter7;
import java.util.Scanner;
public class Ex7_2 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int digit1 = a / 10;
        int digit2 = a % 10;
        if(digit1 == digit2)
            System.out.println("Числа равны");
        else
            System.out.println("Разные числа");
    }
}
