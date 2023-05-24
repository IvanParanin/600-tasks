package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_4 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt(), count = 0, count1 = 0;
        System.out.print("Делители ");
        for(int i = 1; i <= x; i++) {
            if(x % i == 0) {
                count++;
                count1 += i;
                System.out.print(i + " ");

            }
        }
        System.out.println("\nСумма делителей " + count1);
        System.out.println("Количество делителей " + count);
    }
}
