package com.ivanparanin.chapter7;


import java.util.Scanner;

class Ex7_9 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        if(c == a + b)
        System.out.println("Соответствует");
	  else
        System.out.println("Не соответствует");
    }
}
