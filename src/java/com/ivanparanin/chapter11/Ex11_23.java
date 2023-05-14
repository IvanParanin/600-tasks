package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_23 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt(); // количество членов в арифметической прогрессии
        for(int i = 0; i < x; i++) {
           int sum = 7 + (i * 4); // 7 - первый член прогрессии, 4 - разница между членами арифметической прогрессии
            System.out.print(sum + " ");
        }
    }
}
