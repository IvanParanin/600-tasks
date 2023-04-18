package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_4 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double doll = reader.nextDouble();
        double kurs = reader.nextDouble();
        double rub = doll * kurs;
        System.out.println(rub);
    }
}