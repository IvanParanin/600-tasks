package com.ivanparanin.chapter11;

public class Ex11_42 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            int a, b, c, sum;
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            sum = a + b + c;
            if(i % sum == 0)
                System.out.println(i);
        }
    }
}
