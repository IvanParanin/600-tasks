package com.ivanparanin.chapter13;
import java.util.Scanner;
public class Ex13_15 {
static Scanner reader = new Scanner(System.in);
public static void main(String[] args) {
    int x = reader.nextInt(), a, b, sum1 = 0, sum2 = 0;
    a = x / 10;
    b = x % 10;
    if(a > b) {
        for(int i = b; i <= a; i++) {
            sum1 += i;
        }
    }
    if(a < b) {
        for(int i = a; i <= b; i++) {
            sum2 += i;
        }
    }
    System.out.println(sum1);
    System.out.println(sum2);
  }
}
