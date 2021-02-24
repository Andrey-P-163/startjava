package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int count;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, count);
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[count - 1] = number;
    }

    public int getLastNumber() {
        return enteredNumbers[count - 1];
    }

    public void clearNumbers() {
        Arrays.fill(enteredNumbers, 0, count, 0);
        count = 0;
    }
}