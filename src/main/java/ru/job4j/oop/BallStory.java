package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Hare hare = new Hare();
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        fox.tryEat(ball);
        hare.tryEat(ball);
        wolf.tryEat(ball);
    }
}
