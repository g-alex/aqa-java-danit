package hw_6_2.task1;

public class Main {
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