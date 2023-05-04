package com.ivanparanin.chapter10;

public class Ex10_19 {
    public static void main(String[] args) {
        int a, b, c, d, e, count = 0;
        a = (int) (Math.random() * 100 - 50);
        b = (int) (Math.random() * 100 - 50);
        c = (int) (Math.random() * 100 - 50);
        d = (int) (Math.random() * 100 - 50);
        e = (int) (Math.random() * 100 - 50);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        if(a < 0) {
            count++;
        }if (b < 0) {
            count++;
        } if (c < 0) {
            count++;
        } if (d < 0) {
            count++;
        } if (e < 0) {
            count++;
        }
        System.out.println("Знак менялся " + count + " раз/а");
    }
}
