package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private int countPlayerOne;
    private Player playerTwo;
    private int countPlayerTwo;
    private int randomNumber = (int) (Math.random() * 100) + 1;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        do {
            if (countPlayerOne < 10) {
                System.out.print("Введите значение первого игрока - ");
                playerOne.setNumber(sc.nextInt(), countPlayerOne);
                if (playerOne.getNumber() > randomNumber) {
                    System.out.println(playerOne.getName() + ", введенное вами число больше того, что загадал компьютер");
                    countPlayerOne++;
                } else if (playerOne.getNumber() < randomNumber) {
                    System.out.println(playerOne.getName() + ", введенное вами число меньше того, что загадал компьютер");
                    countPlayerOne++;
                } else {
                    countPlayerOne++;
                    System.out.println("Игрок " + playerOne.getName() + " угадал число " + randomNumber + " c " + countPlayerOne + " попытки.");
                    break;
                }
            } else {
                System.out.println("У " + playerOne.getName() + " закончились попытки");
            }

            if (countPlayerTwo < 10) {
                System.out.print("Введите значение второго игрока - ");
                playerTwo.setNumber(sc.nextInt(), countPlayerTwo);
                if (playerTwo.getNumber() > randomNumber) {
                    System.out.println(playerTwo.getName() + ", введенное вами число больше того, что загадал компьютер");
                    countPlayerTwo++;
                } else if (playerTwo.getNumber() < randomNumber) {
                    System.out.println(playerTwo.getName() + ", введенное вами число меньше того, что загадал компьютер");
                    countPlayerTwo++;
                } else {
                    countPlayerTwo++;
                    System.out.println("Игрок " + playerTwo.getName() + " угадал число " + randomNumber + " c " + countPlayerTwo + " попытки.");
                    break;
                }
            } else {
                System.out.println("У " + playerTwo.getName() + " закончились попытки");
            }
        } while (countPlayerOne != 10 || countPlayerTwo != 10);
        dataPrint();
    }

    private void dataPrint() {
        int[] arrayPlOne = Arrays.copyOf(playerOne.getEnteredNumbers(), countPlayerOne);
        System.out.print("Варианты игрока " + playerOne.getName() + ": ");
        for (int array : arrayPlOne) {
            System.out.print(array + " ");
        }
        System.out.println();

        System.out.print("Варианты игрока " + playerTwo.getName() + ": ");
        int[] arrayPlTwo = Arrays.copyOf(playerTwo.getEnteredNumbers(), countPlayerTwo);
        for (int array : arrayPlTwo) {
            System.out.print(array + " ");
        }
        System.out.println();

        Arrays.fill(playerOne.getEnteredNumbers(), 0, countPlayerOne,0);
        Arrays.fill(playerTwo.getEnteredNumbers(), 0, countPlayerTwo,0);
    }
}