package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_12 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int countWinter = 0, countSpring = 0, countSummer = 0, countAutumn = 0, countStud = 1;
        for(int i = 0; i < 20; i++) {
            int day = reader.nextInt();
            int month = reader.nextInt();
            int year = reader.nextInt();
            System.out.println(countStud + "-й" + " ребенок с датой " + day + "." + month + "." + year);
            countStud++;
            System.out.println();
            if(month == 12 || month < 3)
                countWinter++;
            if(month >= 3 && month <= 5)
                countSpring++;
            if(month >=6 && month <= 8)
                countSummer++;
            if(month >= 9 && month <= 11)
                countAutumn++;
        }
        System.out.println("Дети родившиеся зимой: " + countWinter);
        System.out.println("Дети родившиеся весной: " + countSpring);
        System.out.println("Дети родившиеся летом: " + countSummer);
        System.out.println("Дети родившиеся осенью: " + countAutumn);
    }
}
