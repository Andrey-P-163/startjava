public class MyFirstGame {
    public static void main(String[] agre) {
        int randomNum = 10;
        int numberPlayer = 0;
        while (true) {
            if (numberPlayer == randomNum) {
                System.out.println("Вы победили");
                break;
            } else if (numberPlayer > randomNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                numberPlayer--;
            } else if (numberPlayer < randomNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                numberPlayer++;
            }
        }
        System.out.println("До новых встреч");
    }
}