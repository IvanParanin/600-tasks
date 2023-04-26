package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_35 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        char a;
        a = reader.next().charAt(0);
        if(a >= 'A' && a <= 'z')
            System.out.println("Является символом латинского алфавита");
        else
            System.out.println("Не является");
    }
}
