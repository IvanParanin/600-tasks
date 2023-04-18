package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_38 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String a = reader.nextLine();
        String b = reader.nextLine();
        String c = reader.nextLine();
        char x = a.charAt(0);
        char y = b.charAt(0);
        char z = c.charAt(0);
        System.out.println(x + "" + y + "" + z);

    }
}
