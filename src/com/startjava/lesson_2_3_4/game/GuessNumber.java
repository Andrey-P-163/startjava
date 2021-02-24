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
        setRandomNumb();
        do {
            enterNumber(playerOne);
            if (checkNumber(playerOne)) {
                break;
            }

            enterNumber(playerTwo);
            if (checkNumber(playerTwo)) {
                break;
            }
        } while ((playerOne.getCount() != 10 || playerTwo.getCount() != 10));

        printEnteredNumbers(playerOne);
        playerOne.clearNumbers();
        printEnteredNumbers(playerTwo);
        playerTwo.clearNumbers();
    }

    private void setRandomNumb() {
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
            String compareNumbers = (player.getLastNumber() > randomNumber ? ", введенное вами число больше того, что загадал компьютер" : ", введенное вами число меньше того, что загадал компьютер");
            if (player.getLastNumber() != randomNumber) {
                System.out.println(player.getName() + compareNumbers);
            } else {
                System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + player.getCount() + " попытки.");
                return true;
            }
        }
        if (player.getCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void printEnteredNumbers(Player player) {
        System.out.print("Варианты игрока " + player.getName() + ": ");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}