package com.csc205.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void shiftX() {
        double expected = 5.0;

        Point point = new Point(2.0, 3.0);
        point.shiftX(3.0);

        double actual = point.getX();

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void shiftY() {
        double expected = 11.2;

        Point point = new Point(4.0, 12.0);
        point.shiftY(-0.8);

        double actual = point.getY();

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void distance() {
        double expected = 11.6107;

        Point point1 = new Point(6.0, 1.1);
        Point point2 = new Point(-4.0, 7.0);

        double actual = point1.distance(point2);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void rotate() {
        double expectedX = 2.9295;
        double expectedY = 13.3126;

        Point point = new Point(4.1, -13);
        point.rotate(122);

        double actualX = point.getX();
        double actualY = point.getY();

        assertEquals(expectedX, actualX, 0.0001);
        assertEquals(expectedY, actualY, 0.0001);
    }
}