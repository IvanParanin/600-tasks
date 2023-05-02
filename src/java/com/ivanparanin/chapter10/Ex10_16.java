package com.ivanparanin.chapter10;

public class Ex10_16 {
    public static void main(String[] args) {
        int a, b, max = 94, min = 17, a1, a2, b1, b2;
        a = (int) (Math.random() * (max - min) + min);
        b = (int) (Math.random() * (max - min) + min);
        System.out.println(a + " " + b);
        if (a > b)
            System.out.println("Первое число больше");
        else if (a < b)
            System.out.println("Второе число больше");
        else
            System.out.println("Числа равны");
        a1 = a / 10;
        a2 = a % 10;
        b1 = b / 10;
        b2 = b % 10;
        if (a1 < a2 && a1 < b1 && a1 < b2)
            System.out.println("Первая цифра в первом числе самая наименьшая");
        else if (a2 < a1 && a2 < b1 && a2 < b2)
            System.out.println("Вторая цифра в первом числе самая наименьшая");
        else if (b1 < a1 && b1 < a2 && b1 < b2)
            System.out.println("Первая цифра во втором числе самая наименьшая");
        else if (b2 < a1 && b2 < a2 && b2 < b1)
            System.out.println("Вторая цифра во втором числе самая наименьшая");
         else
            System.out.println("Что-то не так.");
    }
}
