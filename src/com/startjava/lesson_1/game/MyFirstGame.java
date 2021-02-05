package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] agre) {
        int randomNum = 10;
        int playerNum = 0;
        do {
            if (playerNum > randomNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNum--;
            } else if (playerNum < randomNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNum++;
            }
        } while (playerNum != randomNum);
        System.out.println("Вы победили");
    }
}