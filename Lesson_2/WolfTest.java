public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Man";
        System.out.println(wolfOne.gender);
        wolfOne.name = "Old wolf";
        System.out.println(wolfOne.name);
        wolfOne.weight = 50.5;
        System.out.println(wolfOne.weight);
        wolfOne.age = 20;
        System.out.println(wolfOne.age);
        wolfOne.color = "Grey";
        System.out.println(wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
    }
}