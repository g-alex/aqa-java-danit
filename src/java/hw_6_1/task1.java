package hw_6;

class Animal {
    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("I am flying");
    }
}

class Fish extends Animal {
    public void swim() {
        System.out.println("I am swimming");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof-woof");
    }
}

public class task1 {
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