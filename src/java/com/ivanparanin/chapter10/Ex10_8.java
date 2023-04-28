package com.ivanparanin.chapter10;
import java.util.Scanner;
public class Ex10_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = (int)  (Math.random() * a);
        System.out.println(a + " " + b); // TODO

    }
}
