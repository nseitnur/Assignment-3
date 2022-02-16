package com.company;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("red",true);

        Circle circle = new Circle(1.0,"blue",true);

        Rectangle rectangle = new Rectangle(4.0 , 4.0,"green", false);

        Square square = new Square(3.0,"black",false);

        System.out.println(shape1.toString());

        System.out.println(circle.toString());

        System.out.println(rectangle.toString());

        System.out.println(square.toString());


    }
}
