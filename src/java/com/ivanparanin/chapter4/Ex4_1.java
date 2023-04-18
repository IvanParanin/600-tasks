package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i = reader.nextInt();
        String text = String.join(" " + String.valueOf(i).split("")); // TODO
        System.out.println(text);
    }
}