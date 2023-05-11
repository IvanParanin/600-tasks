package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_21 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("От..");
        for(int i = (x + 1); i <= (x + 17); i++)
            System.out.print(i + " ");
        System.out.println("\nи до");
    }
}
