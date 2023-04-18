package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_36 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String p, f, p2, l2;
        p = "Пассажир";
        f = "вылетает в";
        p2 = reader.nextLine();
        l2 = reader.nextLine();
        System.out.println(p + " " + p2 + " " + f + " " + l2);


    }
}
