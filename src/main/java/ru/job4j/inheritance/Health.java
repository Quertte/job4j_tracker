package ru.job4j.inheritance;

public class Health {

    private String temperature;
    private String pressure;
    private String complaints;
    private String mood;

    public Health(String temperature, String pressure, String complaints, String mood) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.complaints = complaints;
        this.mood = mood;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getComplaints() {
        return complaints;
    }

    public String getMood() {
        return mood;
    }
}
