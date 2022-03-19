package com.harman.Assessmentweek2;

abstract class Shapes {
    abstract double getparameters();

}
class RectangleArea extends Shapes {
    double length;
    double breadth;

    RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getparameters() {
        return length * breadth;

    }
}
class SquareArea extends Shapes
{
    double side;
    SquareArea(double side)
    {
        this.side = side;

    }
    double getparameters()
    {
        return side*side;
    }
}
class CircleArea extends  Shapes
{
    double radius;
    CircleArea(double radius)
    {
        this.radius=radius;
    }
    double getparameters()
    {
        return (22.0/7.0)*radius*radius;
    }
}
class Area{
    public static void main(String[] args) {
        RectangleArea recobj = new RectangleArea(12,4);
        SquareArea sqrobj = new SquareArea(2);
        CircleArea cirobj = new CircleArea(2);
        System.out.println(" Rectangle Area: "+recobj.getparameters());
        System.out.println(" Square Area: "+sqrobj.getparameters());
        System.out.println(" Circle Area: "+cirobj.getparameters());

    }
}