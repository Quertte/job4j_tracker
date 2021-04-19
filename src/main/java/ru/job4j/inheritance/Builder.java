package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int countOfBuildings;

    public Builder(String name, String surname, String education, String birthday, String mathSkill, int countOfBuildings) {
        super(name, surname, education, birthday, mathSkill);
        this.countOfBuildings = countOfBuildings;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getCountOfBuildings() {
        return countOfBuildings;
    }

    public boolean buildHouse(Project project) {
        return true;
    }

}
