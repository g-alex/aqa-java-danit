package hw_12.task2;

public class Vehicle {
    private String name;
    private int speed;
    private int price;
    private int countOfWheel;

    public Vehicle(String name, int speed, int price, int countOfWheel) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.countOfWheel = countOfWheel;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public int getCountOfWheel() {
        return countOfWheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOfWheel=" + countOfWheel +
                '}';
    }
}
