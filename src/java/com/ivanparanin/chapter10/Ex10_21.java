package com.ivanparanin.chapter10;

public class Ex10_21 {
    public static void main(String[] args) {
        int x1, y1, x2, y2, down = -30, up = 30;
        double l1, ugol;
        x1 = down + (int)((up - down + 1) * Math.random());
        y1 = down + (int)((up - down + 1) * Math.random());
        x2 = down + (int)((up - down + 1) * Math.random());
        y2 = down + (int)((up - down + 1) * Math.random());
        System.out.println(x1 + "," + y1 + " --> " + x2 + "," + y2);
        l1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(l1);
        System.out.println((int) l1);
        ugol = Math.atan(1.0 * (y2 - y1) / (x2 - x1));
        ugol = Math.toDegrees((ugol));
        System.out.println(ugol);
        if(x1 *  x2 < 0)
            System.out.println("X");
        if(y1 * y2 < 0)
            System.out.println("Y");
        if(x1 * x2 > 0 && y1 * y2 > 0)
            System.out.println("Нет");
    }
}
