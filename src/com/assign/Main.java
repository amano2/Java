package com.assign;

class Rectangle {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print the area of the rectangle
    public void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Method to calculate and print the perimeter of the rectangle
    public void printPerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {
    // Constructor calling the constructor of the parent class 'Rectangle'
    public Square(double side) {
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(5, 8);

        // Displaying the area and perimeter of the rectangle
        rectangle.printArea();
        rectangle.printPerimeter();
        System.out.println();

        // Creating a Square object
        Square square = new Square(4);

        // Displaying the area and perimeter of the square
        square.printArea();
        square.printPerimeter();
    }
}

