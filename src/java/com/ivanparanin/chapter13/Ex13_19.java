package com.ivanparanin.chapter13;

public class Ex13_19 {
    public static void main(String[] args) {
        int a, i1, i2, b, count = 0, sum = 0;
        for(int i = 10; i <=49; i++) {
            i1 = i / 10;
            i2 = i % 10;
            a = (i1 + i2) * 2;
            b = i1 * i2;
            if(a == b) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(sum);
    }
}
