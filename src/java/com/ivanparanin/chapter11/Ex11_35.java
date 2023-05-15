package com.ivanparanin.chapter11;
import java.util.Scanner;
public class Ex11_35 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        for(int i = x + 1; i <= (x + 25); i++)
            if(i % 2 != 0)
                System.out.println(i);
    }
}
