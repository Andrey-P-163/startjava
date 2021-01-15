public class Cycle {
    public static void main(String[] agre) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int inputData = 6;
        while (inputData >= -6) {
            System.out.println(inputData);
            inputData -= 2;
        }

        inputData = 10;
        int sum = 0;
        do {
            if (inputData % 2 != 0) {
                sum += inputData;
            }
            inputData++;
        } while (inputData != 20);
        System.out.println(sum);
    }
}