package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_7 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0, count1 = 0, x = reader.nextInt();
        for(int i = 0; i < 29; i++) {
            int a = reader.nextInt();
            if (a == x) {
                count++;
            }
            if (a < x) {
                count1++;
            }
        }
        System.out.println("Количество равных значений " + count);
        System.out.println("Количество меньших значений " + count1);
    }
}
