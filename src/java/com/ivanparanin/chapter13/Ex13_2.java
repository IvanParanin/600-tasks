package com.ivanparanin.chapter13;

public class Ex13_2 {
    public static void main(String[] args) {
        int gen, count = 0;
        for(int i = 0; i < 20; i++) {
             gen = 10 + (int) (Math.random() * (99 - 10) + 1);
             count += gen;
            System.out.print(gen + " ");
        }
        System.out.println("\nСумма " + count);
    }
}
