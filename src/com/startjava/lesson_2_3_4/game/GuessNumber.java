package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;


    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void run() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        do {
            if (playerOne.getCount() < 10) {
                System.out.print("Введите значение первого игрока - ");
                playerOne.setNumber(sc.nextInt(), playerOne.getCount());
                if (playerOne.getEnteredNumbers()[playerOne.getCount()] > randomNumber) {
                    System.out.println(playerOne.getName() + ", введенное вами число больше того, что загадал компьютер");
                    playerOne.setCount(playerOne.getCount() + 1);
                } else if (playerOne.getEnteredNumbers()[playerOne.getCount()] < randomNumber) {
                    System.out.println(playerOne.getName() + ", введенное вами число меньше того, что загадал компьютер");
                    playerOne.setCount(playerOne.getCount() + 1);
                } else {
                    playerOne.setCount(playerOne.getCount() + 1);
                    System.out.println("Игрок " + playerOne.getName() + " угадал число " + randomNumber + " c " + playerOne.getCount() + " попытки.");
                    break;
                }
            } else {
                System.out.println("У " + playerOne.getName() + " закончились попытки");
            }

            if (playerTwo.getCount() < 10) {
                System.out.print("Введите значение второго игрока - ");
                playerTwo.setNumber(sc.nextInt(), playerTwo.getCount());
                if (playerTwo.getEnteredNumbers()[playerTwo.getCount()] > randomNumber) {
                    System.out.println(playerTwo.getName() + ", введенное вами число больше того, что загадал компьютер");
                    playerTwo.setCount(playerTwo.getCount() + 1);
                } else if (playerTwo.getEnteredNumbers()[playerTwo.getCount()] < randomNumber) {
                    System.out.println(playerTwo.getName() + ", введенное вами число меньше того, что загадал компьютер");
                    playerTwo.setCount(playerTwo.getCount() + 1);
                } else {
                    playerTwo.setCount(playerTwo.getCount() + 1);
                    System.out.println("Игрок " + playerTwo.getName() + " угадал число " + randomNumber + " c " + playerTwo.getCount() + " попытки.");
                    break;
                }
            } else {
                System.out.println("У " + playerTwo.getName() + " закончились попытки");
            }
        } while (playerOne.getCount() != 10 || playerTwo.getCount() != 10);
        printEnteredNumbers(playerOne);
        resetData(playerOne);
        printEnteredNumbers(playerTwo);
        resetData(playerTwo);
    }

    private void printEnteredNumbers(Player player) {
        int[] arrayCopy = Arrays.copyOf(player.getEnteredNumbers(), player.getCount());
        System.out.print("Варианты игрока " + player.getName() + ": ");
        for (int array : arrayCopy) {
            System.out.print(array + " ");
        }
        System.out.println();
    }

    private void resetData(Player player) {
        Arrays.fill(player.getEnteredNumbers(), 0, player.getCount(), 0);
        player.setCount(0);
    }
}