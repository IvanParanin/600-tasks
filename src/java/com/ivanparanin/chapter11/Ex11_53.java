package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_53 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int m, n;
        m = reader.nextInt();
        n = reader.nextInt();
        if(m < n) {
            for (int i = m; i <= n; i++) {
                System.out.print(i + " ");
            }
        }else
            System.out.println("Ошибка");
    }
}
