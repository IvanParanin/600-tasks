package com.ivanparanin.chapter13;

import java.util.Scanner;
public class Ex13_13 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int mark, countGood = 0, countBad = 0;
        for(int i = 1; i <= 30; i++) {
            mark = reader.nextInt();
           if(mark == 3)
               countGood++;
            if(mark == 2)
                countBad++;
        }
        System.out.println("Ученики с удовлетворительными оценками: " + countGood);
        System.out.println("Ученики с неудовлетворительными оценками: " + countBad);
    }
}
