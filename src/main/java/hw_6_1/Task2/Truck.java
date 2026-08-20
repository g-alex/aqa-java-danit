package hw_6_1.Task2;

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
