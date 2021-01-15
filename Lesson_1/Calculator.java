public class Calculator {
    public static void main(String[] agre) {
        int numberOne = 2;
        int numberTwo = 3;
        double result = 0;
        char mathSign = '+';

        if (mathSign == '+') {
            result = numberOne + numberTwo;
        } else if (mathSign == '-') {
            result = numberOne - numberTwo;
        } else if (mathSign == '*') {
            result = numberOne * numberTwo;
        } else if (mathSign == '%') {
            result = numberOne % numberTwo;
        } else if (mathSign == '/') {
            result = (double) numberOne / numberTwo;
        } else if (mathSign == '^') {
            result = 1;
            for (int i = 1; i <= numberTwo; i++) {
                result *= numberOne;
            }
        }
        System.out.println(numberOne + " " + mathSign + " " + numberTwo + " = " + result);
    }
}