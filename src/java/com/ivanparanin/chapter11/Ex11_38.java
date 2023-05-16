package com.ivanparanin.chapter11;
import java.util.Scanner;

public class Ex11_38 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt(); // получаем целое число с клавиатуры
            for(int i = 0; i < 15; i++) {
                int gen = 100 + (int) (Math.random() * (999 - 100) + 1); // генерируем 15 трехзначных чисел
                if (gen % x == 0) { // если генерируемое число делится без остатка на вводимое,
                    System.out.print(gen + ": ");
                    gen = (int) Math.ceil(Math.sqrt(gen)); // то выводим квадратный корень с округлением в большую сторону
                    System.out.println(gen);
                } else if (gen % x != 0) { // если генерируемое число делится с остатком на вводимое,
                    System.out.print(gen + ": ");
                    gen = (int) Math.floor(Math.sqrt(gen)); // то выводим квадратный корень с округлением в меньшую сторону
                    System.out.println(gen);
                }
            }
        }
    }

