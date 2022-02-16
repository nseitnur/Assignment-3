package com.company;

public class Square extends Rectangle {


    public Square( double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setLength(double side) {
       side = getLength();
    }

    @Override
    public void setWidth(double side) {
        side = getWidth();
    }

    @Override
    public String toString() {
        if(this.isFILLED()){
            return "A Square with side "+getWidth() + " which is a subclass of " + super.toString() ;        }
        else{
            return "A Square with side "+getWidth() +  " which is a subclass of " + super.toString();
        }
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }
    @Override
    public double getPerimeter() {
        return (getLength()+getWidth())*2;
    }


}
