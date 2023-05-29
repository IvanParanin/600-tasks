package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_16 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        double a, sum = 0;
        n = reader.nextInt();
        for(int i = 1; i <= n; i++) {
            a = Math.sqrt(2 * i - 1);
            sum += a;
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
