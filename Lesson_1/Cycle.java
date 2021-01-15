public class Cycle {
    public static void main(String[] agre) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        int value = 6;
        while (value >= -6) {
            System.out.println(value);
            value = value - 2;
        }
        int v = 10;
        int result = 0;
        do {
            if (v % 2 != 0) {
                result = result + v;
            }
            v++;
        } while (v != 20);
        System.out.println(result);
    }
}