package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println(answer);
        switch (answer) {
            case 0 -> System.out.println("Да!");
            case 1 -> System.out.println("Нет!");
            default -> System.out.println("Может быть!");
        }
    }
}
