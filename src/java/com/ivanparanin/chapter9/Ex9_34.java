package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_34 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String a, b;
        a = reader.next();
        b = reader.next();
        if(a.equals(b))
            System.out.println("Идентичны");
        else
            System.out.println("Разные");
    }
}
