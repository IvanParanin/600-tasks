package com.ivanparanin.chapter7;
import java.util.Scanner;
public class Ex7_4 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        x = reader.nextInt();
        if(x == 0)
            System.out.println("Ok");
        else
            System.out.println("No");
    }
}
