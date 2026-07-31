package hw_4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] hours = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        System.out.println("Введите три индекса через пробел или Enter (для имен, часов и мест):");
        int nameIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        int hourIndex = scanner.nextInt();

        String name = names[nameIndex];
        String place = places[placeIndex];
        int hour = hours[hourIndex];

        System.out.println(name + " буде йти до " + place + " о " + hour + ":00");
    }
}