package ru.job4j.poly1;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит!");
    }
}
