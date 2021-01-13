public class MyFirstGame{
    public static void main (String[] agre){
        
        int numberPC = 0;
        boolean victory = false;

        while (!victory){

            int numberPlayer = 0;

            if (numberPlayer == numberPC){
                victory = true;
            } else if (numberPlayer > numberPC){
                System.out.println ("Введенное вами число больше того, что загадал компьютер");
            } else if (numberPlayer < numberPC) {
                System.out.println ("Введенное вами число меньше того, что загадал компьютер");
            }
        }
        System.out.println ("До новых встреч");
    }
}