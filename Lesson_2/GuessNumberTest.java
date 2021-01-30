import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner inPutData = new Scanner(System.in);
        String repeat;
        do {
            System.out.print("Введите имя первого игрока - ");
            Player playerOne = new Player(inPutData.nextLine());
            System.out.print("Введите имя второго игрока - ");
            Player playerTwo = new Player(inPutData.nextLine());
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.guessNumber();
            do {
                System.out.print("Хотите повторить игру? [да/нет]: ");
                repeat = inPutData.nextLine();
            } while (!repeat.equals("да") && (!repeat.equals("нет")));
        } while(!repeat.equals("нет"));
    }
}