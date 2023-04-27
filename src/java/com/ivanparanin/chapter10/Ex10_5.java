package com.ivanparanin.chapter10;

public class Ex10_5 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 10 + (int) (Math.random() * 99);
        b = (int) (Math.random() * a);
        c = (int) (Math.random() * a);
        d = (int) (Math.random() * a);
        System.out.println("Первая генерация " + a);
        System.out.println("Последующие три генерации " + "\n" + b + "\n" + c + "\n" + d);
    }
}
