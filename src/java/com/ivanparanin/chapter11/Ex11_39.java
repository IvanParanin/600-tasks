package com.ivanparanin.chapter11;

public class Ex11_39 {
    public static void main(String[] args) {
        for(int i = 10; i <= 99; i++) { // выводим все положительные двухзначные числа
            int a, b;
            a = i / 10;
            b = i % 10;
            if((a * b) >= 10 && (a * b) <= 99) // определяем, чтобы их произведение давало тоже двухзначное число
                System.out.println(i); // выводим данные числа
        }
    }
}
