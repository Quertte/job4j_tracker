package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int numberOfCalls;

    public Doctor(String name, String surname, String education, String birthday, int numberOfCalls) {
        super(name, surname, education, birthday);
        this.numberOfCalls = numberOfCalls;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Health diagnose(Pacient pacient) {
        return null;
    }
}
