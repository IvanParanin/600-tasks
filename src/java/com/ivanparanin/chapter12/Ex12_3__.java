package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_3__ {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x, x1 = 1, count = 0;
        for (int i = 0; i < 12; i++) {
            x = reader.nextInt();
            x1 = x;
            if (x > x1) 
                count++;


        }
        System.out.println(count);
    }
}