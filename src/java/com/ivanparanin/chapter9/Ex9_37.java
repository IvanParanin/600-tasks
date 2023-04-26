package com.ivanparanin.chapter9;
import java.util.Scanner;
public class Ex9_37 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String name1, name2, sName1, sName2;
        name1 = reader.next();
        sName1 = reader.next();
        name2 = reader.next();
        sName2 = reader.next();
        if((name1.equals(name2) && (sName1.equals(sName2)))) {
            System.out.println("И тезки и однофамильцы");
        } else {
            if (name1.equals(name2)) {
                System.out.println("Тезки");
            } else
                System.out.println("Разные имена");
            if (sName1.equals(sName2))
                System.out.println("Однофамильцы");
            else
                System.out.println("Разные фамилии");
        }
    }
}
