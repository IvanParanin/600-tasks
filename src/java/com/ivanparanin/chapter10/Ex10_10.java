package com.ivanparanin.chapter10;

public class Ex10_10 {
    public static void main(String[] args) {
        int a, b, c, down = 2, up = 11, sum;
        a = down + (int) ((up - down + 1) * Math.random());
        b = down + (int) ((up - down + 1) * Math.random());
        c = down + (int) ((up - down + 1) * Math.random());
        System.out.println(a + " " + b + " " + c);
        sum = a + b + c;
        if(sum < 21)
            System.out.println("Недобор");
        if(sum > 21)
            System.out.println("Перебор");
        if(sum == 21)
            System.out.println("Очко");
    }
}
