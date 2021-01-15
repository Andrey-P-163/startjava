public class MyFirstGame {
    public static void main(String[] agre) {
        int randomNum = 0;
        while (true) {
            int numberPlayer = 0;
            if (numberPlayer == randomNum) {
                System.out.println("Вы победили");
                break;
            } else if (numberPlayer > randomNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (numberPlayer < randomNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
        }
        System.out.println("До новых встреч");
    }
}