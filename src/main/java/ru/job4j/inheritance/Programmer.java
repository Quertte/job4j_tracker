package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String lang;

    public Programmer(String lang) {
        this.lang = lang;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getLang() {
        return lang;
    }

    public void coding() {

    }
}
