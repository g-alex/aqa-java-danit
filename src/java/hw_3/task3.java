package hw_3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int diff = (num1 >= num2) ? (num1 - num2) : (num2 - num1);

        System.out.println("Difference between the larger and smaller number: " + diff);

        scanner.close();
    }
}