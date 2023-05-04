package com.ivanparanin.chapter10;

public class Ex10_20 {
    public static void main(String[] args) {
        int a, b, c, d, e, max = 0, diff;
        a = (int) (Math.random() * 10);
        b = 100 +(int) (Math.random() * 900);
        System.out.println(a + " " + b);
        c = b / 100;
        d = (b % 100) / 10;
        e = b % 10;
        if(c >= d && c >= e) {
            max = c;
        } if(d >= c && d >= e) {
            max = d;
        }if(e >= c && e >= d) {
            max = e;
        }
        System.out.println("Максимальная цифра " + max);
        if(a != 0 && max != 0) {
            if(a > max) {
                diff = a / max;
                System.out.println("Первая сгенерированная цифра больше максимальной цифры из трехзначного числа в " + diff + " раз/а");
            } else if (a < max) {
                diff = max / a;
                System.out.println("Первая сгенерированная цифра меньше максимальной цифры из трехзначного числа в " + diff + " раз/а");
            } else {
                System.out.println("Равны");
            }
        } else
            System.out.println("Ошибка");
    }
}
