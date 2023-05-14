package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_25 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        for(int i = 0; i <= x; i++)
            System.out.print(i + " ");
    }
}
