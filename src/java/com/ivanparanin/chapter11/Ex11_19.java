package com.ivanparanin.chapter11;

public class Ex11_19 {
    public static void main(String[] args) {
        System.out.println("Начало");
        for(int i = 99; i >= 10; i--)
            if(i % 5 == 0)
                System.out.print(i + " ");
        System.out.println("\nКонец");
    }
}
