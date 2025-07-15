package org.example.oop.point;

import java.util.Objects;

import static java.lang.Math.*;

public class Point implements Cloneable {
    private int x;
    private int y;

    // конструктор по умолчанию
    public Point() {
    }

    // конструткор копирования
    public Point(Point p) {
        if (p == null) {
            return;
        }
        this.x = p.x;
        this.y = p.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // функция расcтояние точки от плоскости
    public double distancePoint(int x, int y) {
        return sqrt(pow(this.x - x, 2) + pow(this.y - y, 2));
    }

    // функция расстояние между двумя точками
    public static double distanceBetweenPoint(Point firstPoint, Point secondPoint) {
        if (firstPoint == null || secondPoint == null) {
            return Double.POSITIVE_INFINITY;
        }
        return firstPoint.distancePoint(secondPoint.x, secondPoint.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        Point clone = (Point) super.clone();
        clone.x = x;
        clone.y = y;
        return clone;
    }
}