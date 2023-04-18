package com.ivanparanin.chapter6;

import java.util.Scanner;

class Ex6_1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x = reader.nextInt(); // 5, 9, 9, 3, 8, 8.
        int y = reader.nextInt(); // 9, 9, 5, 8, 8, 3.
        if(x < y)
            System.out.println("х меньше у"); // 5 & 9,
        if(x == y)
            System.out.println("х равна у"); // 9 & 9,
        if(x > y)
            System.out.println("х больше у"); // 9 & 5,
    }
}