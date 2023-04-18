package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_39 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String a = reader.nextLine();
        String b = reader.nextLine();
        String c = reader.nextLine();
        String y;
        y = a + b.charAt(0) + "." + c.charAt(0) + ".";
        System.out.println(y);

    }
}
