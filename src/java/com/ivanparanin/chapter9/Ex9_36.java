package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_36 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String a, b;
        a = reader.nextLine();
        b = reader.nextLine();
        if(a.equals(b))
            System.out.println("Являются тезками");
        else
            System.out.println("Не являются");
    }
}
