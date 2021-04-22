package ru.job4j.poly;

public interface Transport {
    void go();

    void putPassenger(int passenger);

    double fuelUpPrice(double fuel);
}
