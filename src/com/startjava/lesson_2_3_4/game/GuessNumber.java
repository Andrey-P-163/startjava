package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int randomNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void run() {
        randomNumber();
        do {
            enterNumber(playerOne);
            if (checkNumber(playerOne)) {
                System.out.println("Ход переходит к следующему игроку.");
            } else {
                break;
            }
            enterNumber(playerTwo);
            if (checkNumber(playerTwo)) {
                System.out.println("Ход переходит к следующему игроку.");
            } else {
                break;
            }
        } while ((playerOne.getCount() != 10 || playerTwo.getCount() != 10));

        printEnteredNumbers(playerOne);
        playerOne.clearData();
        printEnteredNumbers(playerTwo);
        playerTwo.clearData();
    }

    private void randomNumber() {
        randomNumber = (int) (Math.random() * 100) + 1;
    }

    private void enterNumber(Player player) {
        player.setCount(player.getCount() + 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + " введите значение - ");
        player.setEnteredNumber(sc.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getCount() <= 10) {
            if (player.getLastNumber() > randomNumber) {
                System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
            } else if (player.getLastNumber() < randomNumber) {
                System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + player.getCount() + " попытки.");
                return false;
            }
        }
        if (player.getCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return true;
    }

    private void printEnteredNumbers(Player player) {
        System.out.print("Варианты игрока " + player.getName() + ": ");
        for (int number : player.getEnteredNumber()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}