package com.eleanorxie.module1assignment.module1point4;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    //return the area of the circle.
    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    //return key characteristics of the circle.
    public String toString() {
        return "Circle{" +
                "Area" + getArea() +
                ", radius=" + radius + ", colour=" + this.colour +
                '}';
    }
}
