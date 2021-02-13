package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);
        System.out.println("Модель - " + jaeger1.getModelName());
        System.out.println("Марк - " + jaeger1.getMark());
        System.out.println("Страна - " + jaeger1.getOrigin());
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.useVortexCannon();
        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-51", "Australia", 6.2f, 1.850f, 10, 10, 9);
        System.out.println("Рост - " + jaeger2.getHeight() + "м");
        System.out.println("Масса - " + jaeger2.getWeight() + "т");
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger2.useVortexCannon();
    }
}