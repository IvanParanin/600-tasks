package com.ivanparanin.chapter11;

public class Ex11_47 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            System.out.println("В начале " + i);
            int a, b, c, d, e;
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            d = (c * 100) + (b * 10) + a;
            System.out.println("Наоборот " + d);
            e = (int) Math.sqrt(i * d);
            System.out.println("Из корня " + e);
            if(e != d && b != 0 && c != 0 && i != e)
                System.out.println("Нужный итог " + i);
        }
    }
}
