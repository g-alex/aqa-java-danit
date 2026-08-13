package hw_4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] hours = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        System.out.println("Enter three indices separated by space or Enter (for names, hours and places):");
        int nameIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        int hourIndex = scanner.nextInt();

        String name = names[nameIndex];
        String place = places[placeIndex];
        int hour = hours[hourIndex];

        System.out.println(name + " will go to " + place + " at " + hour + ":00");
    }
}