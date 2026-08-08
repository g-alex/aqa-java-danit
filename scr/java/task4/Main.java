package task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().
                setModel("BMW")
                .setPrice(1000)
                .setMaxSpeed(100)
                .setCountOfWheels(4)
                .build();
        System.out.println(car);
    }

}
