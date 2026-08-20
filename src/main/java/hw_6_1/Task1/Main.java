package hw_6_1.Task1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Dog dog = new Dog();

        bird.eat();
        bird.fly();

        fish.sleep();
        fish.swim();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}