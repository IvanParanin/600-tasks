package com.ivanparanin.chapter7;

import java.util.Scanner;
class Ex7_6 {
        static Scanner reader = new Scanner(System.in);
        public static void main(String[] args) {
            int a, b;
            a = reader.nextInt();
            b = reader.nextInt();
            if(a == b)
                System.out.println("==");
            else
                System.out.println("!=");
        }
    }
