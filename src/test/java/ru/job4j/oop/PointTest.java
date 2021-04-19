package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void distance3d() {
        Point a = new Point(0,2,4);
        Point b = new Point(0,0,0);
        double result = a.distance3d(b);
        assertEquals(result, 4.47, 0.01);
    }

    @Test
    public void distance3dVersion2() {
        Point a = new Point(5,5,5);
        Point b = new Point(2,2,2);
        double result = a.distance3d(b);
        assertEquals(result, 5.19, 0.01);
    }

    @Test
    public void distance() {
        Point a = new Point(0,0);
        Point b = new Point(0,2);
        double result = a.distance(b);
        assertEquals(result, 2.0,0.01);
    }

    @Test
    public void distanceVersion2() {
        Point a = new Point(1,3);
        Point b = new Point(0,2);
        double result = a.distance(b);
        assertEquals(result, 1.41,0.01);
    }
}