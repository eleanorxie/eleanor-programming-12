package com.eleanorxie.module1assignment.module1point1;

public class Triangle extends TwoDShape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height){
        super(width, height);

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.width = side1;
        super.height = heronsHeight();
    }

    private double heronsHeight(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double heronsHeight = area * 2 / side1;
        return heronsHeight;
    }

    public double getArea(){
        return super.getArea() / 2;
    }
}
