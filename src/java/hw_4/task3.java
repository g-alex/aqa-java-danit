package hw_4;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите общую вместимость склада (кг): ");
        double capacity = scanner.nextDouble();

        while (capacity > 0) {
            System.out.println("\nСвободного места на складе: " + capacity + " кг");
            System.out.print("Введите вес металла для сдачи: ");
            double weight = scanner.nextDouble();

            if (weight < 5) {
                System.out.println(" Ошибка: Минимальная вес приёма — 5 кг!");
            } else if (weight > capacity) {
                System.out.println(" Ошибка: На складе нет столько места! Можно сдать максимум " + capacity + " кг.");
            } else {
                capacity -= weight;
                System.out.println(" Успешно принято " + weight + " кг.");
            }
        }

        System.out.println("\n Склад полностью заполнен! Приём окончен.");
    }
}