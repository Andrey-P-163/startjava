package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int numberOne;
    private int numberTwo;
    private double result;
    private char mathSign;

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
                printResult();
                break;
            case '-':
                result = Math.subtractExact(numberOne, numberTwo);
                printResult();
                break;
            case '*':
                result = Math.multiplyExact(numberOne, numberTwo);
                printResult();
                break;
            case '%':
                result = Math.floorMod(numberOne, numberTwo);
                printResult();
                break;
            case '/':
                result = (double) numberOne / numberTwo;
                printResult();
                break;
            case '^':
                result = Math.pow(numberOne, numberTwo);
                printResult();
                break;
            default:
                System.out.println("Работа с этим арифмитическим действием в разработке. Приходите позже.");
        }
    }

    private void printResult() {
        System.out.println(numberOne + " " + mathSign + " " + numberTwo + " = " + result);
    }
}
