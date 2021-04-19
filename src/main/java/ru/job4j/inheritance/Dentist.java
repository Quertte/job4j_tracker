package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String pullTooth;

    public Dentist(String name, String surname, String education, String birthday, int numberOfCalls, String pullTooth) {
        super(name, surname, education, birthday, numberOfCalls);
        this.pullTooth = pullTooth;
    }

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
