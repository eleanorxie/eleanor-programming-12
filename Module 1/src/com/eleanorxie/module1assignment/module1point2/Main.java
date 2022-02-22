package com.eleanorxie.module1assignment.module1point2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(1.0,2.0));
        shapes.add(new Triangle(1.0, 2.0, 3.0));
        shapes.add(new Circle(2.2));

        for (TwoDShape t: shapes) {
            System.out.println(t.getArea());
            System.out.println(t);
        }
    }
}
