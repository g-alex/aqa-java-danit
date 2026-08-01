package hw_6_2;

abstract class Figure {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with side = " + side;
    }
}

// 3. Класс Треугольник
class Triangle extends Figure {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}

class Circle extends Figure {
    private double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}

public class task1 {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(10, 5, 10, 8, 6);
        Figure circle = new Circle(4);

        System.out.println("=== WORKING WITH SQUARE ===");
        System.out.println("Information: " + square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println("\n=== WORKING WITH TRIANGLE ===");
        System.out.println("Information: " + triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        System.out.println("\n=== WORKING WITH CIRCLE ===");
        System.out.println("Information: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}