package hw_9.task3;

public class AnimalFactory {

    public static Animal createAnimal(String typeAnimal){
        switch (typeAnimal){
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                System.out.println("Not found type");
                return null;
        }
    }
}
