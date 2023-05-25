package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_9 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x, x1, sum = 0, sum2 = 0;
        x = reader.nextInt();
        x1 = reader.nextInt();
        for(int i = 1; i < x; i++){
            if(x % i == 0)
                sum += i;
        }
        for (int i = 1; i < x1; i++) {
            if(x1 % i == 0)
                sum2 += i;
        }
        if(sum % 2 == 0 && sum2 % 2 == 0)
            System.out.println("Четно-близкое по сумме");
        else
            System.out.println("Ошибка");
    }
}
