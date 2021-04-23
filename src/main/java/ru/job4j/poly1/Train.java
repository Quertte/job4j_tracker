package ru.job4j.poly1;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Чух-чух-чух-чух");
    }
}
