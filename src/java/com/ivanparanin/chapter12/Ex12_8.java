package com.ivanparanin.chapter12;

public class Ex12_8 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 10; i <= 99; i++) {
            int a, b;
            a = i / 10;
            b = i % 10;
            if((a - b) <= 3)
                count++;
        }
        System.out.println(count);
    }
}
