package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when2Max() {
        int first = 5;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void when3Max() {
        int first = 2;
        int second = 10;
        int third = 15;
        int result = Max.max(first, second, third);
        int expected = 15;
        assertEquals(result, expected);
    }

    @Test
    public void when4Max() {
        int first = 10;
        int second = 5;
        int third = 7;
        int fourth = 20;
        int result = Max.max(first, second, third, fourth);
        int expected = 20;
        assertEquals(result, expected);
    }
}