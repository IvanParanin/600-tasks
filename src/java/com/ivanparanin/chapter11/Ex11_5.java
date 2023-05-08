package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_5 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int k = 1;
        int num = 0;
        for(int i = 1; i <= 4; i++) {
            int x = reader.nextInt();
            if(x % 2 == 0) {
                num = (num * 10) + x;
            } else {
                k = k * 10;
                num = num + (x * k);
            }
            System.out.println(num);
        }
    }
}
