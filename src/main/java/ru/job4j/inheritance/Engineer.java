package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String mathSkill;

    public Engineer(String name, String surname, String education, String birthday, String mathSkill) {
        super(name, surname, education, birthday);
        this.mathSkill = mathSkill;
    }

    public String getMathSkill() {
        return mathSkill;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Project design(Task task) {
        return new Project("hard", "huge");
    }
}
