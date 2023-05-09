package com.ivanparanin.chapter11;

public class Ex11_12 {
    public static void main(String[] args) {
        int b, c, d;
        for (int i = 1; i <= 11; i++) {
            int a = 10 + (int) (Math.random() * (99 - 10) + 1);
            if (a % 5 == 0) {
                b = a / 10;
                c = a % 10;
                d = b + c;
                System.out.print(a + ":" + "(" + d + ") ");
            } else {
                b = a / 10;
                c = a % 10;
                d = b * c;

                System.out.print(a + ":" + "[" + d + "] ");
            }
        }
    }
}

