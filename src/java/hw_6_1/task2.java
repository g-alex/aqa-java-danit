package hw_6_1;

class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Транспорт движется со скоростью " + speed + " км/ч");
    }

    public void stop() {
        System.out.println("Транспорт " + name + " остановился");
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
        System.out.println("Транспорт " + name + " движется со скоростью " + speed + " км/ч с кол-вом людей: " + passengerCapacity);
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
        System.out.println("Транспорт " + name + " с грузоподъемностью " + loadCapacity + " т движется со скоростью " + speed + " км/ч");
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