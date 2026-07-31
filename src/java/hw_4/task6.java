package hw_4;

import java.util.Arrays;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[45];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        System.out.println("Массив из 45 элементов:");
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}