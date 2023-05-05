package com.ivanparanin.chapter11;

public class Ex11_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 12; i <= 28; i++) {
            count++;
            System.out.print("\t" + count + ": " + i);
        }
        System.out.println();
        count = 0;
        for (int i = 315; i >= 7; i -= 45) {
            count++;
            System.out.print("\t" + count + ": " + i);
        }
        System.out.println();
        count = 0;
        for(int i = 1; i <= 1500; i +=5) {
            count++;
            System.out.println(count + ": " + i);
        }
        System.out.println();
        count = 0;
        for(int i = 1; i <= 200; i += 10) {
            count++;
            System.out.println("\t" + count + ": " + i);
        }
        System.out.println();
        count = 0;
        for(int i = 300; i >= 1; i -= 1) {
            count++;
            System.out.println(count + ": " + i);
        }
        System.out.println();
        count = 0;
        for(int i = 169; i >= 1; i -= 7) {
            count++;
            System.out.println(count + ": " + i); 
        }
    }
}
