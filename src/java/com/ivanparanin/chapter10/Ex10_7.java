package com.ivanparanin.chapter10;

public class Ex10_7 {
    public static void main(String[] args) {
        int a, b, c, d, e, a1, b1;
        a = 10 + (int) (Math.random() * 99);
        b = 10 + (int) (Math.random() * 99);
        System.out.println("Генерация значений интервала " + a + " " + b);
        if(a > b) {
            a1 = b;
            b1 = a;
        }
        else {
            a1 = a;
            b1 = b;
        }
        c = a1 + (int)((b1 - a1 + 1) * Math.random());
        d = a1 + (int)((b1 - a1 + 1) * Math.random());
        e = a1 + (int)((b1 - a1 + 1) * Math.random());

        System.out.println("Генерация значений внутри интервала " + c + " " + d + " " + e);

    }
}
