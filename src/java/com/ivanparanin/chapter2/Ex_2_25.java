package com.ivanparanin.chapter2;

import java.util.Scanner;

public class Ex_2_25 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y, z, P1, P2, S1, S2, V;
        x = reader.nextInt();
        y = reader.nextInt();
        z = reader.nextInt();
        P1 = (x + y) * 2;
        P2 = (x + z) * 2;
        S1 = (x * y);
        S2 = (x * z);
        V = x * y * z;
        System.out.println("Периметр одной стороны: " + P1);
        System.out.println("Периметр второй стороны: " + P2);
        System.out.println("Площадь одной стороны: " + S1);
        System.out.println("Площадь второй стороны: " + S2);
        System.out.println("Объем: " + V);

    }
}
