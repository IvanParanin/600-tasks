package com.ivanparanin.chapter11;

public class Ex11_17 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            int a;
            a = i % 10;
            if(a == 7)
                System.out.print(i + " ");
        }
    }
}
