package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int countOfBuildings;

    public Builder(int countOfBuilds) {
        this.countOfBuildings = countOfBuilds;
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
