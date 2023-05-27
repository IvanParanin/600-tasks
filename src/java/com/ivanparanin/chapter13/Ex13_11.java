package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_11 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int inf, day;
        for(int i = 1; i <= 50; i++) {
            System.out.println("День: ");
            day = reader.nextInt();
            System.out.println("Информация: ");
            inf = reader.nextInt();
            if(inf >= 7 && inf <= 10)
                System.out.print("Опасно:");
            else if (inf <= 5)
                System.out.print("Спокойно:");
            else if (inf == 6)
                System.out.println("Умеренно:");
            if (day == 1)
                System.out.println(" понедельник");
            if (day == 2)
                System.out.println(" вторник");
            if (day == 3)
                System.out.println(" среда");
            if (day == 4)
                System.out.println(" четверг");
            if (day == 5)
                System.out.println(" пятница");
            if (day == 6)
                System.out.println(" суббота");
            if (day == 7)
                System.out.println(" воскресенье");
        }
    }
}
