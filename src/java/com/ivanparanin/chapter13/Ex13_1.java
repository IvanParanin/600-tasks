package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int s1 = 0, s2 = 0;
        for(int i = 1; i < 7; i++) {
            int x = reader.nextInt();
            if(x % 2 == 0)
                s1 += x;
            if(x % 3 == 0)
                s2 += x;
        }
        System.out.print(s1 + " ");
        System.out.print(s2 + " ");
    }
}
