public class Calculator {
        private int numberOne;
        private int numberTwo;
        private double result;
        private char mathSign;

        public void setNumberOne(int numberOne) {
            this.numberOne = numberOne;
        }

        public void setNumberTwo(int numberTwo) {
            this.numberTwo = numberTwo;
        }

        public void setMathSign(char mathSign) {
            this.mathSign = mathSign;
        }

        public double calculate() {
            switch(mathSign) {
                case '+':
                    result = numberOne + numberTwo;
                    break;
                case '-':
                    result = numberOne - numberTwo;
                    break;
                case '*':
                    result = numberOne * numberTwo;
                    break;
                case '%':
                    result = numberOne % numberTwo;
                    break;
                case '/':
                    result = (double) numberOne / numberTwo;
                    break;
                case '^':
                    result = 1;
                for (int i = 1; i <= numberTwo; i++) {
                    result *= numberOne;
                }
                break;
            }
        return result;
    }
}
