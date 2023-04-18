package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_30 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int hrs = reader.nextInt();
        int min1 = reader.nextInt();
        int sec1, min2, min3;
        sec1 = hrs * 3600 + min1 * 60;
        min2 = hrs * 60 + min1;
        min3 = 24 * 60 - min2;
        System.out.println("Сейчас " + hrs + " часов " + min1 + " минут.");
        System.out.println("С полуночи прошло " + sec1 + " секунд");
        System.out.println("С полуночи прошло " + min2 + " минут");
        System.out.println("До полуночи осталось " + min3 + " минут");

       // System.out.println("");
    }
}
