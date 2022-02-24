package com.eleanorxie.module1assignment.module1point4;

public class Triangle extends TwoDShape implements Rotate {
    private double side1;
    private double side2;
    private double side3;
    //create a boolean to determine which overloading constructor should run.
    private boolean check = true;

    public Triangle(double width, double height, Colour colour){
        super(width, height, colour);
        check = false;
    }

    /**
     * The sum of two sides needs to be greater than the third side.
     * @param side1 > 0
     * @param side2 > 0
     * @param side3 > 0
     * @param colour only red, blue, green, none
     */
    public Triangle(double side1, double side2, double side3, Colour colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.width = side1;
        super.height = heronsHeight();
        super.colour = colour;
    }
    //return the heron's height of the triangle using the heron's formula.
    private double heronsHeight(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double heronsHeight = area * 2 / side1;
        return heronsHeight;
    }

    //public version of returning heron's height for the purpose of Triangle Test.
    public double publicHeronsHeight(){
        double s2 = (side1 + side2 + side3) / 2;
        double area2 = Math.sqrt(s2 * (s2 - side1) * (s2 - side2) * (s2 - side3));
        double heronsHeight2 = area2 * 2 / side1;
        return heronsHeight2;
    }

    public double getArea(){
        if (check) {
            double s1 = (side1 + side2 + side3) / 2;
            double area1 = Math.sqrt(s1 * (s1 - side1) * (s1 - side2) * (s1 - side3));
            return area1;
        }
        else {
            return (super.getHeight() * super.getWidth() / 2);
        }
    }

    @Override
    public String toString() {
        if (check){
            return "Triangle{" +
                    "side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 + ", Area=" + getArea() + ", colour=" + colour + "}";
        }
        else{
            return "Triangle{" + "width=" + getWidth() + ", height=" + getHeight() + ", colour=" + colour + "}";
        }
    }


    @Override
    public void rotate90() {

    }

    public void rotate180() {

    }

    public void rotate(double degree) {

    }

}
