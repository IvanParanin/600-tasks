package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_31 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int m, v, E;
        m = reader.nextInt();
        v = reader.nextInt();
        E = (m * (v * v)) / 2;
        System.out.println("Кинетическая энергия тела равна E: " + E + " Дж.");

    }
}