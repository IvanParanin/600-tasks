package com.ivanparanin.chapter9;
import java.util.Scanner;

public class Ex9_10 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        if(a == c && a != b)
            System.out.println("Равны a & b");
        if(a == b && b == c)
            System.out.println("Все равны");
        if(c > a && c > b)
            System.out.println("c больше a и b");
    }
}
