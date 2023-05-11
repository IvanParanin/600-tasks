package com.ivanparanin.chapter11;

public class Ex11_15 {
    public static void main(String[] args) {
        int a;
        System.out.println("Начало");
        for (int i = 10; i <= 99; i++) {
            if(i % 2 == 0) {
                a = i;
                System.out.println(a);
            }
        }
        System.out.println("Завершение");
    }
}