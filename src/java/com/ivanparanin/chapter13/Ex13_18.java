package com.ivanparanin.chapter13;
import  java.util.Scanner;
public class Ex13_18 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int month, sum, percent;
        System.out.println("Введите количество месяцев: ");
        month = reader.nextInt();
        System.out.println("Введите суммы под кредит: ");
        sum = reader.nextInt();
        System.out.println("Введите процентную ставку: ");
        percent = reader.nextInt();
        for(int i = 1; i <= month; i++) {
            sum += sum / 100 * percent;
        }
        System.out.println("Итоговая сумма: " + sum + " за " + month + " месяцев");
    }
}
