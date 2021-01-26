import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] agre) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String userResponse;
        do {
            System.out.print("Введите первое число: ");
            calc.setNumberOne(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setMathSign(scan.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setNumberTwo(scan.nextInt());

            System.out.println(calc.getNumberOne() + " " + calc.getMathSign() + " " + calc.getNumberTwo() + " = " + calc.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                userResponse = scan.nextLine();
            } while (!userResponse.equals("да") && (!userResponse.equals("нет")));
        } while (!userResponse.equals("нет"));
    }
}
