package com.ivanparanin.chapter11;

public class Ex11_37 {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            int a = (int)(Math.random() * 18 - 10);
            if(a < 0) {
                System.out.print(a + " = ");
                a *= a;
                System.out.println(a + " ");
            }
                else if (a > 0) {
                    int result;
                    System.out.print(a + " = ");
                    result = (int) (Math.sqrt(a));
                System.out.println(result);

                }
            }
        }
    }

