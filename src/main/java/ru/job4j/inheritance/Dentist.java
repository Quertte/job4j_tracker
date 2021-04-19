package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String pullTooth;

    public String getPullTooth() {
        return pullTooth;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public boolean treatTooth(Pacient pacient) {
        return true;
    }
}
