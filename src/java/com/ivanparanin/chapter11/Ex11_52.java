package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_52 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        for(int i = x; i >= 1; i--) {
            if(i != 1)
                System.out.print(i + " ");
            else System.out.println(i);
        }
    }
}
