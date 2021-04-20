package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String nameSurnamePatronymic;
    private int group;
    private LocalDate receipt;

    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    public void setNameSurnamePatronymic(String nameSurnamePatronymic) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public LocalDate getReceipt() {
        return receipt;
    }

    public void setReceipt(LocalDate receipt) {
        this.receipt = receipt;
    }
}
