package hw_4;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total warehouse capacity (kg): ");
        double capacity = scanner.nextDouble();

        while (capacity > 0) {
            System.out.println("\nAvailable warehouse space: " + capacity + " kg");
            System.out.print("Enter the weight of metal to deposit: ");
            double weight = scanner.nextDouble();

            if (weight < 5) {
                System.out.println(" Error: Minimum accepted weight is 5 kg!");
            } else if (weight > capacity) {
                System.out.println(" Error: Not enough space in the warehouse! Maximum you can deposit is " + capacity + " kg.");
            } else {
                capacity -= weight;
                System.out.println(" Successfully accepted " + weight + " kg.");
            }
        }

        System.out.println("\n Warehouse is completely full! Reception ended.");
    }
}