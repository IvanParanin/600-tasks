package com.ivanparanin.chapter10;

public class Ex10_14 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = 10 + (int) (Math.random() * 90);
        b = 10 + (int) (Math.random() * 90);
        c = 10 + (int) (Math.random() * 90);
        d = 10 + (int) (Math.random() * 90);
        e = 10 + (int) (Math.random() * 90);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        f = a % 10;
        if(f == 0)
            System.out.println("a соответствует");
        else
            System.out.println("Не соответствует");
        f = b % 10;
        if(f == 0)
            System.out.println("b соотвествует");
        else
            System.out.println("Не соответствует");
        f = c % 10;
        if(f == 0)
            System.out.println("c соответствует");
        else
            System.out.println("Не соответствует");
        f = d % 10;
        if(f == 0)
            System.out.println("d соотвествует");
        else
            System.out.println("Не соответствует");
        f = e % 10;
        if(f == 0)
            System.out.println("e соотвествует");
        else
            System.out.println("Не соответствует");

    }
}
