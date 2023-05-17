package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_56 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m, max, min;
        n = reader.nextInt();
        m = reader.nextInt();
        if (n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        for (int i = min; i <= max; i++)
            System.out.println(i);
    }
}