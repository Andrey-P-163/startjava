public class ConditionalStatment {
    public static void main(String[] agre) {
        int age = 21;
        if (age > 20) {
            System.out.println("Age more 20.");
        }
        boolean gender = true;
        if (gender) {
            System.out.println("Gender - male.");
        }
        if (!gender) {
            System.out.println("Gender - female.");
        }
        double height = 1.9;
        if (height < 1.80) {
            System.out.println("Height - less 1,80.");
        } else {
            System.out.println("Height - more 1,80.");
        }
        char firstLetter = 'A';
        if (firstLetter == 'M') {
            System.out.println("It's not Max.");
        } else if (firstLetter == 'I') {
            System.out.println("It's not Ivan.");
        } else {
            System.out.println("No matter who it is.");
        }
    }
}