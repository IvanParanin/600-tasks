package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_21 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b;
        b = 60;
        a = reader.nextDouble();
        if((a >= b) && (a <= (b * b * 24.0))) {
            System.out.print(a + " секунд = ");
            a = a / b;
            System.out.print(a + " минут и ");
            a = a / b;
            System.out.println(a + " час");
        }
        else
            System.out.println("Рассчет не производится");
    }
}
