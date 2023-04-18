package com.ivanparanin.chapter3;

import java.util.Scanner;

class Ex3_10 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double V, P, k, eur;
        V = reader.nextDouble();
        P = reader.nextDouble();
        k = reader.nextDouble();
        eur = (V + P) * k;
        System.out.println(eur);
    }
}


