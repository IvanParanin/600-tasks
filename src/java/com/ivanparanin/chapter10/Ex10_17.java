package com.ivanparanin.chapter10;

public class Ex10_17 {
    public static void main(String[] args) {
        double a, b, c, P, S;
        a = Math.random() * 10.5;
        b = Math.random() * 10.5;
        c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        S = (int) (0.5 * (a * b));
        P = (int) (a + b + c);
        System.out.println("Гипотенуза равна " + c);
        System.out.println("Периметр равен " + P);
        System.out.println("Площадь равна "+ S);
    }
}
