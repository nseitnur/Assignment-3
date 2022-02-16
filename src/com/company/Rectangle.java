package com.company;

public class Rectangle extends Shape {
    private double width;
    private double length;


    public Rectangle(double width,double length , String color ,boolean filled ) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return getLength()*getWidth();
    }

    public double getPerimeter() {
        return (getLength()+getWidth())*2;
    }


    @Override
    public String toString() {
        if(this.isFILLED()){
            return "A Rectangle with width "+getWidth() + " and " + getLength() + " which is a subclass of " + super.toString() ;        }
        else{
            return "A Rectangle with width "+getWidth() + " and " + getLength() + " which is a subclass of " + super.toString();
        }
    }



}
