package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_26 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println("Начало");
        int a = 0;
        if(x > 0)
            a = -x;
        for(a = a + 1; a < x; a++)
            System.out.print(a + " ");
        System.out.println("\nЗавершение");
    }
}
