public class JaegerTest {
    public static void main(String[] args){
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Coyotetango");
        System.out.println("Модель - " + jaeger1.getModelName());
        jaeger1.setMark("Mark-");
        jaeger1.setMark("Mark-1");
        System.out.println("Марк - " + jaeger1.getMark());
        jaeger1.setOrigin("Japan");
        System.out.println("Страна - " + jaeger1.getOrigin());
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(2.312f);
        jaeger1.setSpeed(5);
        jaeger1.setStrength(7);
        jaeger1.setArmor(4);
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.useVortexCannon();
        jaeger1.setModelName("Coyote Tango");
        System.out.println("Модель - " + jaeger1.getModelName());


        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-51");
        jaeger2.setOrigin("Australia");
        jaeger2.setHeight(6.2f);
        System.out.println("Рост - " + jaeger2.getHeight() + "м");
        jaeger2.setWeight(1.850f);
        System.out.println("Масса - " + jaeger2.getHeight() + "т");
        jaeger2.setSpeed(10);
        jaeger2.setStrength(10);
        jaeger2.setArmor(9);
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger2.useVortexCannon();
    }
}