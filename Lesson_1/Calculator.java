public class Calculator{
    public static void main (String[] agre){

        int numberOne = 2;
        int numberTwo = 3;
        int resultInt = 0;
        double resultDouble = 0;
        char symbol = '+';

        if (symbol == '+') {
            resultInt = numberOne + numberTwo;
            System.out.println(numberOne + " " + symbol + " " + numberTwo + " = " + resultInt);
        
        } else if (symbol == '-') {
            resultInt = numberOne - numberTwo;
            System.out.println(numberOne + " " + symbol + " " + numberTwo + " = " + resultInt);
        
        } else if (symbol == '*') {
            resultInt = numberOne * numberTwo;
            System.out.println(numberOne + " " + symbol + " " + numberTwo + " = " + resultInt);
        
        } else if (symbol == '%') {
            resultInt = numberOne % numberTwo;
            System.out.println(numberOne + " " + symbol + " " + numberTwo + " = " + resultInt);
        
        } else if (symbol == '/') {
            resultDouble = (double) numberOne / numberTwo;                                          //Решения проблемы с выводом результат деления не придумал. Данный способ нашел в гугле.
            System.out.println(numberOne + " " + symbol + " " + numberTwo + " = " + resultDouble);
        
        } else if (symbol == '^') {
            resultInt = 1;
            for (int i = 1; i <= numberTwo; i++) {
                resultInt = resultInt * numberOne;
            }
            System.out.println(numberOne + " " + symbol + " " + numberTwo + " = " + resultInt);
        }
    }
}