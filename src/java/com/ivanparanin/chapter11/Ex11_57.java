package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_57 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        for(int i = 1; i <= 15; i++) {
            a += 15;
            System.out.println(i + "#" + a);
        }
    }
}
