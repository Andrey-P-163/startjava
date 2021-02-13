package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int numberOne;
    private int numberTwo;
    private double result;
    private char mathSign;
    private int count;

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public char getMathSign() {
        return mathSign;
    }

    public int getCount() {
        return count;
    }

    public double getResult() {
        return result;
    }

    public void setExpression(String expression) {
        String[] partExp = expression.split(" ");
        this.numberOne = Integer.parseInt(partExp[0]);
        this.mathSign = partExp[1].charAt(0);
        this.numberTwo = Integer.parseInt(partExp[2]);
    }

    public void calculate() {
        switch (mathSign) {
            case '+':
                result = Math.addExact(numberOne, numberTwo);
                break;
            case '-':
                result = Math.subtractExact(numberOne, numberTwo);
                break;
            case '*':
                result = Math.multiplyExact(numberOne, numberTwo);
                break;
            case '%':
                result = Math.floorMod(numberOne, numberTwo);
                break;
            case '/':
                result = (double) numberOne / numberTwo;
                break;
            case '^':
                result = Math.pow(numberOne, numberTwo);
                break;
            default:
                count = 1;
        }
    }
}


