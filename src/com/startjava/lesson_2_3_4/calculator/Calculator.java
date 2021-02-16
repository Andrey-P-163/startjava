package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int numberOne;
    private int numberTwo;
    private char mathSign;

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setExpression(String expression) {
        String[] partExp = expression.split(" ");
        this.numberOne = Integer.parseInt(partExp[0]);
        this.mathSign = partExp[1].charAt(0);
        this.numberTwo = Integer.parseInt(partExp[2]);
    }

    public double calculate() {
        switch (mathSign) {
            case '+':
                return Math.addExact(numberOne, numberTwo);
            case '-':
                return Math.subtractExact(numberOne, numberTwo);
            case '*':
                return Math.multiplyExact(numberOne, numberTwo);
            case '%':
                return Math.floorMod(numberOne, numberTwo);
            case '/':
                return (double) numberOne / numberTwo;
            case '^':
                return Math.pow(numberOne, numberTwo);
        }
        return 0;
    }
}



