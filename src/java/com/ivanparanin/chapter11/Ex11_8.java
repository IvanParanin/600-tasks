package com.ivanparanin.chapter11;

public class Ex11_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int a = -10 + (int) (Math.random() * 35);
            if(a > 0)
                System.out.print(a + " ");
            else
                System.out.print(a + "? ");
        }
    }
}
