package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setGroup(1);
        student.setReceipt(LocalDate.now());
        student.setNameSurnamePatronymic("Andrew Nedogibchenko Aleksandrovish");
        System.out.println("Студент: " + student.getNameSurnamePatronymic() + ", Группа №"
                + student.getGroup() + ", поступил: " + student.getReceipt());
    }
}
