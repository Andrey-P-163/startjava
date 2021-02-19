package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
            enterNumbers(playerOne);
            playerOne.setCount(playerOne.getCount() + 1);
            if (!checkNumbers(playerOne)) {
            } else {
                break;
            }
            enterNumbers(playerTwo);
            playerTwo.setCount(playerTwo.getCount() + 1);
            if (!checkNumbers(playerTwo)) {
            } else {
                break;
            }
        } while ((playerOne.getCount() != 10 || playerTwo.getCount() != 10));

        printEnteredNumbers(playerOne);
        clearData(playerOne);
        printEnteredNumbers(playerTwo);
        clearData(playerTwo);
    }

    private void enterNumbers(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + " введите значение - ");
        player.setEnteredNumbers(sc.nextInt(), player.getCount());
    }

    private boolean checkNumbers(Player player) {
        if (player.getCount() < 10) {
            if (player.getEnteredNumbers()[player.getCount() - 1] > randomNumber) {
                System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
            } else if (player.getEnteredNumbers()[player.getCount() - 1] < randomNumber) {
                System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
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

    private void clearData(Player player) {
        int[] copyArray = player.getEnteredNumbers();
        Arrays.fill(copyArray, 0);
        for (int i = 0; i < copyArray.length; i++) {
            player.setEnteredNumbers(copyArray[i], i);
        }
        player.setCount(0);
    }

    private void randomNumber() {
        randomNumber = (int) (Math.random() * 100) + 1;
    }

}