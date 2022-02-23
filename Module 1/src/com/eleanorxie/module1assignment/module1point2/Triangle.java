package com.eleanorxie.module1assignment.module1point2;
import java.lang.Math;


public class Triangle extends TwoDShape {
    private double side1;
    private double side2;
    private double side3;

    private boolean check = true;

    public Triangle(double width, double height){
        super(width, height);
        check = false;
    }

    /**
     * The sum of two sides needs to be greater than the third side.
     * @param side1
     * @param side2
     * @param side3
     */

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
        if (check) {
                return "Triangle{" +
                        "side1=" + side1 +
                        ", side2=" + side2 +
                        ", side3=" + side3 + ", Area=" + getArea() + "}";
        }
        else{
            return "Triangle{" + "width=" + getWidth() + ", height=" + getHeight() + "}";
        }
    }
}
