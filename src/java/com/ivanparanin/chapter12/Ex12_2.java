package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_2 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x, count = 0, count1 = 0;
        for(int i = 0; i < 15; i++) {
            x = reader.nextInt();
            if(x % 2 == 0) {
                count++;
            } else if (x / 2 != 0) {
                count1++;

            }
        }
        System.out.println("Четных: " + count + "\nНечетных: " + count1);
    }
}
