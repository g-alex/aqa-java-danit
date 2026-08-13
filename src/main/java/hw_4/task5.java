package hw_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Числа от 0 до 99
        }

        System.out.println("Generated array: " + Arrays.toString(numbers));
        System.out.print("Enter a number to search for: ");
        int userNumber = scanner.nextInt();

        boolean isFound = false;
        for (int num : numbers) {
            if (num == userNumber) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Number " + userNumber + " IS in the array!");
        } else {
            System.out.println("Number " + userNumber + " is NOT in the array.");
        }
    }
}