package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_36 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        for(int i = 10; i > 0; i--) {
            x -= 6;
            System.out.println(x);
        }
    }
}
