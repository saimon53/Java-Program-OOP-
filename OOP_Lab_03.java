abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (length * width);
    } }

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return 3.1416 * radius * radius;
    }
    double calculatePerimeter() {
        return 2 * 3.1416 * radius;
    }
}

public class OOP_Lab_03 {
    public static void main (String[] args) {
        Rectangle re = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + re.calculateArea());
        System.out.println("Rectangle Perimeter: " + re.calculatePerimeter());
        Circle c = new Circle(5.0);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter() );

    }
}