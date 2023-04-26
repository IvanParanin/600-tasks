package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_20 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b;
        b = 60;
        a = reader.nextDouble();
        if(a >= b && a <= b * b) {
            System.out.print(a + " секунд = ");
            a = a / b;
            System.out.println(a + " минут(а/ы)");
        }
       else
            System.out.println("Рассчет не производится");
    }
}
