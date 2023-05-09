package com.ivanparanin.chapter11;

public class Ex11_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int a = 27 + (int) (Math.random() * (73 - 27) + 1);
            if(a % 3 == 0)
                System.out.print(a + "# ");
            else
                System.out.print(a + " ");
        }
    }
}
