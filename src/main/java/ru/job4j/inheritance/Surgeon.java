package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int successOperation;

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
