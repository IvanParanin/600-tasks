package com.ivanparanin.chapter10;

public class Ex10_15 {
    public static void main(String[] args) {
        int a, down = 250, up = 746, a1, a2, a3, min = -1, max = 10;
        a = down + (int) ((up - down + 1) * Math.random());
        System.out.println(a);
        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;
        if(a1 <= a2 && a1 <= a3)
            min = a1;
        if(a2 <= a1 && a2 <= a3)
            min = a2;
        if(a3 <= a1 && a3 <= a2)
            min = a3;
        if(a1 >= a2 && a1 >= a3)
            max = a1;
        if(a2 >= a1 && a2 >= a3)
            max = a2;
        if(a3 >= a1 && a3 >= a2)
            max = a3;
        System.out.println(min + " " + max);
        if(a == a2 || a2 == a3 || a1 == a3)
            System.out.println("Да");
        else
            System.out.println("Нет");
    }
}
