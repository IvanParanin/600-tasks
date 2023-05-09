package com.ivanparanin.chapter11;

public class Ex11_13 {
    public static void main(String[] args) {
        int b = 100, c = 999;
        for( ; b <= c; b++) {
            int a = b + (int) (Math.random() * (c - b) + 1);

            System.out.println(a); // TODO доделать
        }
    }
}
