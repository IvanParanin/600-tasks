package com.ivanparanin.chapter4;

import java.util.Scanner;

class Ex4_24 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h;
        a = reader.nextInt();
        b = reader.nextInt();
        c = a / 10;
        d = a % 10;
        e = b / 10;
        f = b % 10;
        g = c * 10 + f;
        h = e * 10 + d;
        System.out.println(g + " " + h);
    }
}
