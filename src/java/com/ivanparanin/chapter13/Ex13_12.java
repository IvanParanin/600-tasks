package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_12 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int mark, students = 0, middleMark = 0, sum = 0;
        for(int i = 1; i <= 30; i++) {
            mark = reader.nextInt();
            sum += mark;
            middleMark = sum / 30;
            if(mark == 2)
                students++;
        }
        System.out.println("Средняя оценка среди 30 учеников: " + middleMark);
        System.out.println("Ученики с неудовлетворительными оценками: " + students);
    }
}
