package com.company;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
       return Math.PI*getRadius()*getRadius();
    }

    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        if(this.isFILLED()){
            return "A Circle with radius "+getRadius() + super.toString() ;        }
        else{
            return "A Circle with radius " +getRadius() + ", which is subclass of "  + super.toString();
        }
    }
}
