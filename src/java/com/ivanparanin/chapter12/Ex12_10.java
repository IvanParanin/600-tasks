package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_10 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt(), count = 0, mark;
        System.out.println("Учеников: " + x);
        for(int i = 0; i < x; i++) {
            mark = reader.nextInt();
            if(mark >= 4 && mark <= 5)
                count++;
        }
        if(count > (x / 2)) {
            System.out.println("Непровальный");
        }
        else
            System.out.println("Провальный");
        System.out.println(count);

    }
}
