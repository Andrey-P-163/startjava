package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] agre) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String userResponse;
        do {
            System.out.print("Введите математическое выражение: ");
            calc.setExpression(scan.nextLine());
            calc.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                userResponse = scan.nextLine();
            } while (!userResponse.equals("да") && (!userResponse.equals("нет")));
        } while (!userResponse.equals("нет"));
    }
}
