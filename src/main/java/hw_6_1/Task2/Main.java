package hw_6_1.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 120, 4);
        Truck truck = new Truck("Volvo", 80, 15.5);

        car.move();
        car.stop();

        System.out.println("---");

        truck.move();
        truck.stop();
    }
}