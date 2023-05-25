package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_7 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt(), count = 0;
        if(x % 2 == 0) {
            for(int i = 1; i <= x; i++) {
                if(x % i == 0) {
                    count += i;
                }
            }
            System.out.println("Дважды четное " + count);
        }else
            System.out.println("Не дважды четное");
    }
}
