import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int randomNumber = (int) (Math.random() * 100) + 1;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private void gameLogic() {
        Scanner numberPlayer = new Scanner(System.in);
        do {
            System.out.print("Введите значение первого игрока - ");
            playerOne.setNumber(numberPlayer.nextInt());
            if (playerOne.getNumber() > randomNumber) {
                System.out.println(playerOne.getName() + ", введенное вами число больше того, что загадал компьютер");
            } else if (playerOne.getNumber() < randomNumber) {
                System.out.println(playerOne.getName() + ", введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println(playerOne.getName() + ", Вы победили!");
                break;
            }
            System.out.print("Введите значение второго игрока - ");
            playerTwo.setNumber(numberPlayer.nextInt());
            if (playerTwo.getNumber() > randomNumber) {
                System.out.println(playerTwo.getName() + ", введенное вами число больше того, что загадал компьютер");
            } else if (playerTwo.getNumber() < randomNumber) {
                System.out.println(playerTwo.getName() + ", введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println(playerTwo.getName() + ", Вы победили!");
                break;
            }
        }while (playerOne.getNumber() != randomNumber && playerTwo.getNumber() != randomNumber);
    }

    public void guessNumber() {
        gameLogic();
    }
}


