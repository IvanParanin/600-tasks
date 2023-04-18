package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_12 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        if(a <= 5)
            System.out.println("Оценка " + a);
        else
            System.out.println("Ошибка");
    }
}