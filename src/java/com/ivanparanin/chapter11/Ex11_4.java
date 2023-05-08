package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_4 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i, x1, x2;
        x1 = reader.nextInt();
        for(i = 1; i < 5; i++) {
            x2 = reader.nextInt();
            if(x2 > x1)
                System.out.println(x2);
            x1 = x2;
        }
    }
}
