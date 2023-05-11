package com.ivanparanin.chapter11;

public class Ex11_18 {
    public static void main(String[] args) {
        System.out.println("Начало");
        for(int i = 9999; i >= 1000; i--) {
            if(i % 100 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\nКонец");
    }
}
