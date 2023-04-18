package com.ivanparanin.chapter5;
import java.util.Scanner;
public class Ex5_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if((a < b) || (a < 100)) // a > b/ a > 100
            System.out.println("True");
        else
            System.out.println("False");
    }
}
