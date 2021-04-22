package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] findByName = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                findByName[count++] = items[i];
            }
        }
        return Arrays.copyOf(findByName, count);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rs = index != -1;
        if (rs) {
            item.setId(id);
            items[index] = item;
        }
        return rs;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rs = index != -1;
        if (rs) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rs;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}