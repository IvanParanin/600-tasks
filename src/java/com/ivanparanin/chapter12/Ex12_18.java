package com.ivanparanin.chapter12;
import java.util.Scanner;
public class Ex12_18 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int x1, x2, count = 0, n;
        x1 = reader.nextInt();
        x2 = reader.nextInt();
        if(x1 > x2)
            n = x1;
        else
            n = x2;
        for(int i = 1; i < n / 2; i++)
            if(x1 % i == 0 && x2 % i == 0)
                count++;
        System.out.println(count);
    }
}
