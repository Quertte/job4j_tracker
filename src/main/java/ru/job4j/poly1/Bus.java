package ru.job4j.poly1;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус мчит по скоростным трассам");
    }
}
