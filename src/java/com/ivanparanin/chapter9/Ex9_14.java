package com.ivanparanin.chapter9;
import java.util.Scanner;

public class Ex9_14 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = reader.nextInt();
        if (a == 1 || a == 2) {
            System.out.println("Неудовлетворительно");
        }
        else if (a == 3) {
            System.out.println("Удовлетворительно");
        } else {
            if (a == 4) {
                System.out.println("Хорошо");
            } else if (a == 5) {
                System.out.println("Отлично");
            } else
                System.out.println("Такой оценки нет!");
        }
    }
}
