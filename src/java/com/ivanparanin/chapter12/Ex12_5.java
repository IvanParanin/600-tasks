package com.ivanparanin.chapter12;

public class Ex12_5 {
    public static void main(String[] args) {
        int x, count = 0, count2 = 0, count3 = 0;
        for(int i = 0; i < 17; i++) {
            x = (int) (Math.random() * 50 - 25);
            System.out.print(x + " ");
            if(x > 0) {
                count++;
            }
            if (x % 2 == 0) {
                count2++;
            }
            if(x >= 1 && x <= 9) {
                count3++;
            }
        }
        System.out.println("\nПоложительные: " + count);
        System.out.println("Четные: " + count2);
        System.out.println("Однозначные: " + count3);
    }
}
