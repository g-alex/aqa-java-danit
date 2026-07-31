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

        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));
        System.out.print("Введите число для поиска: ");
        int userNumber = scanner.nextInt();

        boolean isFound = false;
        for (int num : numbers) {
            if (num == userNumber) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Число " + userNumber + " ЕСТЬ в массиве!");
        } else {
            System.out.println("Числа " + userNumber + " НЕТ в массиве.");
        }
    }
}