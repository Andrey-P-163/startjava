package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;
        do {
            System.out.print("Введите имя первого игрока - ");
            Player playerOne = new Player(sc.nextLine());
            System.out.print("Введите имя второго игрока - ");
            Player playerTwo = new Player(sc.nextLine());
            System.out.println("У Вас 10 попыток.");
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.run();
            do {
                System.out.print("Хотите повторить игру? [да/нет]: ");
                repeat = sc.nextLine();
            } while (!repeat.equals("да") && (!repeat.equals("нет")));
        } while (!repeat.equals("нет"));
    }
}