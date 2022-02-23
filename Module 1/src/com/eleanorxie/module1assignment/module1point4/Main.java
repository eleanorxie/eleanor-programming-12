package com.eleanorxie.module1assignment.module1point4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(1.0,2.0, Colour.GREEN));
        shapes.add(new Triangle(3.0, 4.0, 5.0, Colour.BLUE));
        shapes.add(new Circle(2.2, Colour.RED));
        Triangle angle = new Triangle(2.0,3.0,4.0,Colour.RED);

        for (TwoDShape t: shapes) {
            System.out.println(t.getArea());
            System.out.println(t);
        }
    }
}
