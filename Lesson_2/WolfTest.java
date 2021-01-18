public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Man";
        wolfOne.name = "Old wolf";
        wolfOne.weight = 50.5;
        wolfOne.age = 20;
        wolfOne.color = "Grey";
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
    }
}