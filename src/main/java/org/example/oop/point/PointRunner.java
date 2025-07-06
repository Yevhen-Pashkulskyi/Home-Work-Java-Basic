package org.example.oop.point;

public class PointRunner {
    public static void main(String[] args)throws CloneNotSupportedException {
        Point firstPoint = new Point();
        firstPoint.setX(10);
        int xFirstPoint = firstPoint.getX();
        firstPoint.setY(10);
        int yFirstPoint = firstPoint.getY();
        System.out.println(firstPoint);

        Point secondPoint = new Point();
        secondPoint.setX(5);
        int xSecondPoint = secondPoint.getX();
        secondPoint.setY(5);
        int ySecondPoint = secondPoint.getY();
        System.out.println(secondPoint);

        double pointFirst = firstPoint.distancePoint(xFirstPoint, yFirstPoint);
        System.out.println("Distance: " + pointFirst);
        double pointSecond = secondPoint.distancePoint(xSecondPoint, ySecondPoint);
        System.out.println("Distance: " + pointSecond);

        double distance = Point.distanceBetweenPoint(firstPoint, secondPoint);
        System.out.println("Растояние между точками: " + distance);

        System.out.println("Равенство двух точек: " + firstPoint.equals(secondPoint));

        Point copiedPoint = new Point(firstPoint);
        System.out.println("Копированная точка: " + copiedPoint);
        System.out.println("Равенство с первой точкой с копированной: " + firstPoint.equals(copiedPoint));

        Point clonedPoint = firstPoint.clone();
        System.out.println("Клонированная точка: " + clonedPoint);
        System.out.println("Равенство с первой точки с клонированной: " + firstPoint.equals(clonedPoint));
    }
}
