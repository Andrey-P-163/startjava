public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Man");
        System.out.println(wolfOne.getGender());
        wolfOne.setName("Old wolf");
        System.out.println(wolfOne.getName());
        wolfOne.setWeight(50.5);
        System.out.println(wolfOne.getWeight());
        wolfOne.setAge(20);
        if (wolfOne.getAge() != 0) {
            System.out.println(wolfOne.getAge());
        }
        wolfOne.setColor("Grey");
        System.out.println(wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
    }
}