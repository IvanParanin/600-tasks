package com.ivanparanin.chapter10;
import java.util.Scanner;
public class Ex10_13GameOfDice {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int player_1, player_2, a = 1, winner = 0, winner2 = 0;
        String player1, player2, start = "Бросок";
        System.out.println("Игра началась.");
            do {
                System.out.println("Раунд: " + a);
                player1 = reader.next();
                player2 = reader.next();
                if ((player1.equals(start)) && (player2.equals(start))) {
                    player_1 = 1 + (int) (Math.random() * 6);
                    player_2 = 1 + (int) (Math.random() * 6);
                    System.out.println("У первого игрока " + player_1);
                    System.out.println("У второго игрока " + player_2);
                    if (player_1 > player_2) {
                        System.out.println("Первый игрок победил.");
                        a++;
                        winner++;
                    } else if (player_1 < player_2) {
                        System.out.println("Второй игрок победил.");
                        a++;
                        winner2++;
                    } else {
                        System.out.println("Ничья.");
                        a++;
                    }
                } else
                    System.out.println("Повторите бросок.");
            } while (a <= 10);
            System.out.println();
            if (winner > winner2)
                System.out.println("За всю игру победил первый игрок с результатом " + winner + " против " + winner2 + " у второго.");
            else if (winner < winner2)
                System.out.println("За всю игру победил второй игрок с результатом " + winner2 + " против " + winner + " у первого.");
            else
                System.out.println("Победила дружба");
            System.out.println();
            System.out.println("Спасибо за игру!");
    }
}
