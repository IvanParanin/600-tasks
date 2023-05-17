package com.ivanparanin.chapter11;

public class Ex11_46 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            int a, b;
            a = i / 100;
            b = i % 100;
            if(b % a == 0)
                System.out.print(i + " ");

        }
    }
}
