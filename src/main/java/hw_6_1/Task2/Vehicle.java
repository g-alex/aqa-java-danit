package hw_6_1.Task2;

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
