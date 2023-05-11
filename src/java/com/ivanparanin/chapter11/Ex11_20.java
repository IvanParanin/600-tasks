package com.ivanparanin.chapter11;

public class Ex11_20 {
    public static void main(String[] args) {
        System.out.println("Начало");
        for(int i = 100; i <= 999; i++)
            if(i % 45 == 0)
                System.out.print(i + " ");
        System.out.println("\nКонец");
    }
}
