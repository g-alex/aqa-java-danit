package task2;


public class Vehicle {
    private static Vehicle instance;
    private String name;
    private int speed;
    private int price;

    private Vehicle(String name, int speed,int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;

    }

    public static Vehicle getInstance(String name, int speed,int price) {

        if(instance == null) {
            instance = new Vehicle(name,speed,price);
        }
        return instance;
    }

}
