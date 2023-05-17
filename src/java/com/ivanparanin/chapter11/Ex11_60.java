package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_60 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n = reader.nextInt();
        for(int i = 1; i <= n; i++)
            System.out.println((int) (Math.pow(2, i)));
    }
}
