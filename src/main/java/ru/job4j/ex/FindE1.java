package ru.job4j.ex;

public class FindE1 {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"Andrew", "Marina", "Aleksandr"}, "Aleksandr"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
