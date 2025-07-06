package org.example.oop.point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private Point point;
    private final int NUMBER_TEST = 10;

    // конфигурационный метод
    @BeforeEach
    void setUp() {
        this.point = new Point();
    }

    @Test
//    @Disabled
    void setX() {
//        when
        int expected = NUMBER_TEST;
//        given
        point.setX(expected);
//        then
        assertEquals(expected, point.getX());
    }

    @Test
    void getX() {
        int expected = NUMBER_TEST;

        point.setX(expected);

        assertEquals(expected, point.getX());
    }

    @Test
    void setY() {
        int expected = NUMBER_TEST;

        point.setY(expected);

        assertEquals(expected, point.getY());
    }

    @Test
    void getY() {
        int expected = NUMBER_TEST;

        point.setY(expected);

        assertEquals(expected, point.getY());
    }

    @Test
    void distancePoint() {
        double expected = 0;
        int x = NUMBER_TEST;
        int y = NUMBER_TEST;

        point.setX(x);
        point.setY(y);
        double res = point.distancePoint(x, y);

        assertEquals(expected, res);

    }

    @Test
    void distanceBetweenPoint() {
        double expectedDistance = 7.07106;

        point.setX(NUMBER_TEST);
        point.setY(NUMBER_TEST);
        Point secondPoint = new Point();
        secondPoint.setX(5);
        secondPoint.setY(5);
        double res = Point.distanceBetweenPoint(point, secondPoint);

        assertEquals(expectedDistance, res,0.00001);

    }

    @Test
    void distanceBetweenPointNull() {
        Double expectedDistance = Double.POSITIVE_INFINITY;

        Double res = Point.distanceBetweenPoint(point,null);

        assertEquals(expectedDistance,res);
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        point.setX(NUMBER_TEST);
        point.setY(NUMBER_TEST);

        Point clonePoint = point.clone();

        assertEquals(point.getX(), clonePoint.getX());
        assertEquals(point.getY(), clonePoint.getY());
    }

    @Test
    void testToString() {
        String expected = "Point{x=" + NUMBER_TEST + ", y=" + NUMBER_TEST + "}";

        point.setX(NUMBER_TEST);
        point.setY(NUMBER_TEST);

        assertEquals(expected, point.toString());
    }
}