package com.ivanparanin.chapter11;

public class Ex11_16 {
    public static void main(String[] args) {
        for(int i = 10; i <= 99; i++) {
            if(i % 4 == 0)
                System.out.print("#" + i + " ");
            else
                System.out.print(i + " ");
        }
    }
}
