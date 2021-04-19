package ru.job4j.inheritance;

public class Task {

    private int volumeTime;
    private int countOfHours;

    public Task(int volumeTime, int countOfHours) {
        this.volumeTime = volumeTime;
        this.countOfHours = countOfHours;
    }

    public int getVolumeTime() {
        return volumeTime;
    }

    public int getCountOfHours() {
        return countOfHours;
    }
}
