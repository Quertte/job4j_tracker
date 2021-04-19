package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int successOperation;

    public Surgeon(String name, String surname, String education, String birthday, int numberOfCalls, int successOperation) {
        super(name, surname, education, birthday, numberOfCalls);
        this.successOperation = successOperation;
    }

    public int getSuccessOperation() {
        return successOperation;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public boolean doOperation(Pacient pacient) {
        return true;
    }
}
