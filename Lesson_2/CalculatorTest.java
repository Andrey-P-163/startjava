import java.util.Scanner;

public class CalculatorTest{
    public static void main(String[] agre) {
        Calculator calculator = new Calculator();
        Scanner dataInput = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            int numberOne = dataInput.nextInt();
            calculator.setNumberOne(numberOne);

            System.out.print("Введите знак математической операции: ");
            char mathSign = dataInput.next().charAt(0);
            calculator.setMathSign(mathSign);

            System.out.print("Введите второе число: ");
            int numberTwo = dataInput.nextInt();
            calculator.setNumberTwo(numberTwo);

            System.out.println(numberOne + " " + mathSign + " " + numberTwo + " = " + calculator.getResult());
            System.out.print("Хотите продолжить вычисления? [да/нет]: ");

            boolean count = false;
            while (true) {
                Scanner repeatInput = new Scanner(System.in);
                String inputSolution = repeatInput.nextLine();
                if (inputSolution.equals("Нет")) {
                    count = true;
                    break;
                } else if (inputSolution.equals("Да")) {
                    break;
                } else {
                    System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                }
            }
            if (count == true) {
                break;
            }
        }
    }
}
