package com.ivanparanin.chapter11;

public class Ex11_41 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            int a, b, c;
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0))
                System.out.println(i);
        }
    }
}
