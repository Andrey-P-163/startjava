package com.startjava.lesson_2_3_4.calculator;

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

            if (calc.getCount() == 0) {
                System.out.println(calc.getNumberOne() + " " + calc.getMathSign() + " " + calc.getNumberTwo() + " = " + calc.getResult());
            } else {
                System.out.println("Работа с этим арифмитическим действием в разработке. Приходите позже.");
            }

            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                userResponse = scan.nextLine();
            } while (!userResponse.equals("да") && (!userResponse.equals("нет")));
        } while (!userResponse.equals("нет"));
    }
}
