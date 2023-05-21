package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_15 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0, i;
        int x = reader.nextInt();
        System.out.print("Делители: ");
        for(i = 1; i < x; i++) {
            if (x % i == 0 && i != 1){
                System.out.print(i + " ");
            count++;
          }
        }
        System.out.print("\nКоличество делителей: " + count);
    }
}
