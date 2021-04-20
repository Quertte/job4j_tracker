package ru.job4j.pojo;

public class Book {
    private String name;
    private int countOfPages;

    public Book(String name, int countOfPages) {
        this.name = name;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
}
