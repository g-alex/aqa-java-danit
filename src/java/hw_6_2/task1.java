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
        return "Квадрат со стороной = " + side;
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
        return "Треугольник [основание=" + base + ", высота=" + height + "]";
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
        return "Круг с радиусом = " + radius;
    }
}

public class task1 {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(10, 5, 10, 8, 6);
        Figure circle = new Circle(4);

        System.out.println("=== РАБОТА С КВАДРАТОМ ===");
        System.out.println("Информация: " + square);
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());

        System.out.println("\n=== РАБОТА С ТРЕУГОЛЬНИКОМ ===");
        System.out.println("Информация: " + triangle);
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());

        System.out.println("\n=== РАБОТА С КРУГОМ ===");
        System.out.println("Информация: " + circle);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
    }
}