package com.ivanparanin.chapter2;
import java.util.Scanner;
public class Ex_2_19 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int b, c;
        b = a - 1;
        c = a + 1;
        System.out.print(b + " " + a + " " + c);
    }
}
