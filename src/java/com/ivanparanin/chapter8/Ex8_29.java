package com.ivanparanin.chapter8;

import java.util.Scanner;

class Ex8_29 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        d = reader.nextInt();
        e = (a / b) + (a % b);
        f = (c / d) + (c % d);
        if(e == f)
            System.out.println("Равны");
        else
            System.out.println("Не равны");
      /*
      a = reader.nextInt();
      b = reader.nextInt();
      if(b != 0 && a > b) {
        c = a / b;
        a -= c * b;
        System.out.println(c + " " + b + " " + a);
      }
      else
        System.out.println("Подсчет не производится");
        */
    }
}