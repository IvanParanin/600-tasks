package com.ivanparanin.chapter12;

public class Ex12_9 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i <= 999; i++) {
            int a, b, c;
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if((a * a) + (c * c) == b * b && c != 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + count);
    }
}
