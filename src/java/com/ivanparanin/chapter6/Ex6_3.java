package com.ivanparanin.chapter6;
import java.util.Scanner;

class Ex6_3 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        System.out.println("Введите свой возраст");
        age = reader.nextInt(); // 8---, 19, 18, 21, 13---
        if(age >= 18)
            System.out.println("Можешь участвовать в выборах"); // 19, 18, 21
         else
             System.out.println("Не можешь участвовать");
    }
}

