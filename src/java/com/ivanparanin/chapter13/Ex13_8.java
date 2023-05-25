package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_8 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0, sum = 0, x;
        x = reader.nextInt();
        if(x % 2 == 0) {
            for(int i = 1; i < x; i++) {
                if (x % i == 0) {
                    count++;
                    sum += i;
                }
            }
        }
        if((x % count == 0) && (sum % count == 0))
            System.out.println("Дважды делимое число");
        else
            System.out.println("Ошибка");
    }
}
