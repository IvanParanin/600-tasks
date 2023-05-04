package com.ivanparanin.chapter10;

public class Ex10_18 {
    public static void main(String[] args) {
        int a, b, c, max = 0, min = 0, diff;
        a = 100 + (int) (Math.random() * 900);
        b = 100 + (int) (Math.random() * 900);
        c = 100 + (int) (Math.random() * 900);
        System.out.println(a + " " + b + " " + c);
        if(a > b && a > c) {
            max = a;
        }
        else if (b > a && b > c) {
            max = b;
        }
        else if (c > a && c > b) {
            max = c;
        }
        System.out.println("Наибольшее число " + max);
        if (a < b && a < c) {
            min = a;
        }
        else if (b < a && b < c) {
            min = b;
        }
        else if (c < a && c < b) {
            min = c;
        }
        System.out.println("Наименьшее число " + min);
        diff = max / min;
        System.out.println("Наибольше число больше наименьшего в " + diff + " раз");
    }
}
