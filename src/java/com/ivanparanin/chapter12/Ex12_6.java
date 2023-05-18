package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt();
        int count = 0;
        for(int i = 10; i <= 99; i++) {
            if(x % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.print("\nИтоговое количество чисел, на которые делится " + count + " ");
    }
}
