package com.ivanparanin.chapter10;
import java.util.Scanner;
public class Ex10_12 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, down = 2, up = 11, sum, e;
        a = down + (int) ((up - down + 1) * Math.random());
        b = down + (int) ((up - down + 1) * Math.random());
        c = down + (int) ((up - down + 1) * Math.random());
        System.out.println(a + " " + b + " " + c);
        System.out.println("Хотите получить еще одну карту?");
        e = reader.nextInt();
        if (e == 1) {
            System.out.println(a + " " + b + " " + c + " " + e);
            sum = a + b + c + e;
            if (sum < 21)
                System.out.println("Недобор");
            if (sum > 21)
                System.out.println("Перебор");
            if (sum == 21)
                System.out.println("Очко");
        } else {
            System.out.println(a + " " + b + " " + c);
            sum = a + b + c;
            if (sum < 21)
                System.out.println("Недобор");
            if (sum > 21)
                System.out.println("Перебор");
            if (sum == 21)
                System.out.println("Очко");
        }
    }
}