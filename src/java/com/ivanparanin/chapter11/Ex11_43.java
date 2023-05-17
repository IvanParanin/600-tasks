package com.ivanparanin.chapter11;

public class Ex11_43 {
    public static void main(String[] args) {
        for(int i = 10; i <= 99; i++) {
            int a, b;
            a = i / 10;
            b = i % 10;
            if(a % 3 == 0 && b % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
