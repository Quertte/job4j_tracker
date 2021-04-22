package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус едет");
    }

    @Override
    public void putPassenger(int passenger) {
        System.out.println("Количество пассажиров " + passenger);
    }

    @Override
    public double fuelUpPrice(double fuel) {
        return fuel * 51.0;
    }
}
