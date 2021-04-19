package ru.job4j.inheritance;

public class Pacient {

    private String name;
    private int age;
    private String disease;
    private String gender;
    private boolean isHealthy;

    public Pacient(String name, int age, String disease, String gender, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.gender = gender;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getGender() {
        return gender;
    }
}
