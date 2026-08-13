package hw_5;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private String name;
    private int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }

    public void startGame(Scanner scanner) {
        while (true) {
            System.out.print("Please enter your guess (0-100): ");
            int userGuess = scanner.nextInt();

            if (userGuess < gameNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (userGuess > gameNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}