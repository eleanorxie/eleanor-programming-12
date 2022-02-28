package com.eleanorxie.module1assignment.module1point4;

import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void publicHeronsHeight() {
        //side1 = 3.0, side2 = 4.0, side3 = 5.0
        Triangle triangle1 = new Triangle(3.0, 4.0,5.0, Colour.RED);
        double semiPerimeter1 = (3.0 + 4.0 + 5.0) / 2;
        assertEquals(2 / 3.0 * Math.sqrt(semiPerimeter1 * (semiPerimeter1 - 3.0) * (semiPerimeter1 - 4.0) * (semiPerimeter1 - 5.0)), triangle1.publicHeronsHeight());
    }
    @Test
    void getArea() {
        //side1 = 4.0, side2 = 6.0, side3 = 5.0
        Triangle triangle1 = new Triangle(4.0, 6.0,5.0, Colour.RED);
        double semiPerimeter1 = (4.0 + 6.0 + 5.0) / 2;
        assertEquals(Math.sqrt(semiPerimeter1 * (semiPerimeter1 - 4.0) * (semiPerimeter1 - 6.0) * (semiPerimeter1 - 5.0)), triangle1.getArea());

        //width = 2.0, height = 4.0
        Triangle triangle2 = new Triangle(2.0, 4.0, Colour.RED);
        double area2 = 2.0 * 4.0 / 2;
        assertEquals(area2, triangle2.getArea());

        //radius = 4.0
        Circle circle1 = new Circle(4.0, Colour.NONE);
        assertEquals(PI * 4.0 * 4.0, circle1.getArea());
    }
}