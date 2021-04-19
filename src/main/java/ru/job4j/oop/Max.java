package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return Math.max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(max(first, second, third), fourth);
    }
}
