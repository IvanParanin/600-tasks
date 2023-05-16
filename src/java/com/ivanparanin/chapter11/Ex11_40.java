package com.ivanparanin.chapter11;
/* Выводим положительные трехзначные числа, если
произведение первой и последней цифр равны квадрату средней
 */
public class Ex11_40 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            int a, c, b;
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if((a * c) == (b * b))
                System.out.println(i);
        }
    }
}
