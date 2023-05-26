package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_10 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x1, x2, count = 0, count1 = 0;
        x1 = reader.nextInt();
        x2 = reader.nextInt();
        for(int i = 1; i < x1; i++) {
            if(x1 % i == 0)
                count++;
        }
        for(int i = 1; i < x2; i++) {
            if(x2 % i == 0)
                count1++;
        }
        System.out.println(count + count1);

    }
}
