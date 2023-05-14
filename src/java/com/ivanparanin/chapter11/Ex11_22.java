package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_22 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("От..");
        for(int i = (x - 10); i >= (x - 17); i -= 6) // TODO исправить
            System.out.print(i + " ");
        System.out.println("\nи до");
    }
}
