package com.eleanorxie.module1assignment.module1point4;

public abstract class TwoDShape {
    double width;
    double height;
    Colour colour;

    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape(){
        this.width = 0;
        this.height = 0;
    }

    public abstract double getArea();
    //a setter for height.
    public void setHeight(double height) {
        this.height = height;
    }
    //a setter for width.
    public void setWidth(double width) {
        this.width = width;
    }
    //a getter for height.
    public double getHeight() {
        return height;
    }
    //a getter for width.
    public double getWidth() {
        return width;
    }
}
