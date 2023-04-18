package com.ivanparanin.chapter3;
import java.util.Scanner;
class Ex3_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        int a2, a3, a4;
        a2 = a + 2;
        a3 = a2 + 2;
        a4 = a3 + 2;
        System.out.println(a + " " + a2 + " " +  a3 + " " + a4);
    }
}
