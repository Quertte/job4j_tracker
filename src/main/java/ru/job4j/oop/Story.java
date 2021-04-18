package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer pioneer = new Pioneer();
        Wolf wolf = new Wolf();
        Girl girl = new Girl();
        girl.help(pioneer);
        wolf.eat(girl);
        pioneer.kill(wolf);
    }
}
