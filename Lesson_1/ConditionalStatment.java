public class ConditionalStatment{
    public static void main (String[] agre){
        int age = 21;
        double height = 1.9;
        boolean gender = true;
        char firstLetter = 'A';

        if (age > 20) {
            System.out.println ("Age more 20.");
        }

        if (gender){
            System.out.println ("Gender - male.");
        }

        if (!gender){
            System.out.println ("Gender - female.");
        }

        if (height < 1.80){
            System.out.println ("Height - less 1,80.");
        } else {
            System.out.println ("Height - more 1,80.");
        }

        if (firstLetter == 'M'){
            System.out.println ("It's not Max.");
        } else if (firstLetter == 'I'){
            System.out.println ("It's not Ivan.");
        } else {
            System.out.println ("No matter who it is.");
        }

    }
}