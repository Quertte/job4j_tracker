package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Шилдт", 1500);
        Book book1 = new Book("Хортсман", 1000);
        Book book2 = new Book("Изучаем Java", 800);
        Book book3 = new Book("Clean Code", 700);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getCountOfPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getCountOfPages());
        }

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if(bk.getName().equals("Clean Code")) {
                System.out.println(bk.getName() + " " + bk.getCountOfPages());
            }
        }

    }
}
