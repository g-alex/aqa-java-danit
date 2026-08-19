package hw_9.task4;

public class Car {
    private String model;
    private double price;
    private int maxSpeed;
    private int counnOfWheels;

    private Car(Builder builder) {
        this.model = builder.getModel();
        this.price = builder.getPrice();
        this.maxSpeed = builder.getMaxSpeed();
        this.counnOfWheels = builder.getCounnOfWheels();
    }

    public static class Builder {
        private String model;
        private double price;
        private int maxSpeed;
        private int counnOfWheels;



        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCountOfWheels(int countOfWheels) {
            this.counnOfWheels = countOfWheels;
            return this;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }
        public int getCounnOfWheels() {
            return counnOfWheels;
        }
        public double getPrice() {
            return price;
        }
        public String getModel() {
            return model;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", counnOfWheels=" + counnOfWheels +
                '}';

    }
}
