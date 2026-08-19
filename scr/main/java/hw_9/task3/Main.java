package hw_9.task3;

import static hw_9.task3.AnimalFactory.createAnimal;

public class Main {
    public static void main(String[] args) {
        Animal animalDog = createAnimal("dog");
        animalDog.speak();

        Animal animalCat = createAnimal("cat");
        animalCat.speak();

        Animal animalBird = createAnimal("bird");
        animalBird.speak();

    }
}
