package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 10; i++) {
            int a = reader.nextInt();
            System.out.println("Вводимое значение " + a);
            if(a > 0) {
                count++;
            }
        }
        System.out.println("Положительных чисел: " + count);
    }
}
