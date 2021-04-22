package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра в 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            while (true) {
                if (check(matches)) {
                    count -= matches;
                    System.out.println(player + " вытянул " + matches + " спичек"
                            + " на столе осталось " + count + " спичек");
                    break;
                } else {
                    System.out.println(player + " Вы ввели не верное количество спичек. Введите заново:");
                    matches = Integer.parseInt(input.nextLine());
                }
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

    public static boolean check(int matches) {
        return matches < 4 && matches > 0;
    }
}
