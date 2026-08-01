package hw_6_1;

class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vehicle is moving at speed " + speed + " km/h");
    }

    public void stop() {
        System.out.println("Vehicle " + name + " has stopped");
    }
}

class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + name + " is moving at speed " + speed + " km/h with passengers: " + passengerCapacity);
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + name + " with load capacity " + loadCapacity + " t is moving at speed " + speed + " km/h");
    }
}

public class task2 {
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