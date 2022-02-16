package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color,boolean filled ) {
            this.color = color;
            this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFiled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFILLED() {
        return filled;
    }


    public String toString() {
        if(this.filled){
            return "  shape with color of "+color +  " and filled";        }
        else{
            return "  shape with color of "+color +  " and not filled";
        }
    }

}
