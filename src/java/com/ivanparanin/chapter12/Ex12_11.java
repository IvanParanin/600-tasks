package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_11 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int i, count1 = 0, count2 = 0, stud = 10;
        for (i = 0; i < 10; i++) {
            int answr = reader.nextInt();
            if (answr == 1) {
                count1++;
            } else if (answr == 0) { // todo
                count2++;
            }
            if (count1 > (i / 2))
                System.out.println(count1 + " учеников проголосовали за и экскурсия состоится");
            if (count2 < (i / 2))
                System.out.println(count2 + " учеников проголосовали против и экскурсия не состоится");
        }
    }
}