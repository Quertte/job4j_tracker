package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Andrew"));
        Item item = tracker.findById(1);
        System.out.println(item.getName());
    }
}
