package com.ivanparanin.chapter11;

public class Ex11_10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 19; i++) {
            int a = 0 + (int) ((9 - 0 + 1)*(Math.random()));
            if(a == 0)
                System.out.print(" %" + a + "% ");
            else
                System.out.print(a + " ");
        }
    }
}
