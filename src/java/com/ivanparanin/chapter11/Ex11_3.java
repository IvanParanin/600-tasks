package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_3 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 6; i++) {
            int k = reader.nextInt();
            if(k > 100)
            sum += k;
        }
        System.out.println(sum);
    }
}
