package hw_6;

class Animal {
    public void eat() {
        System.out.println("Я ем");
    }

    public void sleep() {
        System.out.println("Я сплю");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("Я летаю");
    }
}

class Fish extends Animal {
    public void swim() {
        System.out.println("Я плаваю");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Гав-гав");
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