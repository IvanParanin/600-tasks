package com.ivanparanin.chapter12;

public class Ex12_14 {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0;
        for(int i = 0; i < 30; i++) {
            int a = (int) (Math.random() * 40 - 20);
            System.out.print(a + " ");
            if(a > 0)
                count1++;
            if(a < 0)
                count2++;
        }
        if(count1 == count2)
            System.out.println("\nОдинаковое количество отрицательных и положительных чисел");
        else
            System.out.println("\nРазное количество отрицательных и положительных чисел");
    }
}
