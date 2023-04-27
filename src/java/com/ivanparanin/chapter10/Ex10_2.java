package com.ivanparanin.chapter10;

public class Ex10_2 {
    public static void main(String[] args) {
        double a, b;
        a =  Math.random() * 20 - 11;
        b =  Math.random() * 20 - 11;
        int a1 = (int) a;
        int b1 = (int) b;
        System.out.println(a1 + " " + b1);
        if(a1 > b1)
            System.out.println("Наибольшее " + a1);
        else
            System.out.println("Наибольшее " + b1);
        }
    }

