package hw_4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки на палиндром: ");
        String original = scanner.next();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Число " + original + " является палиндромом!");
        } else {
            System.out.println("Число " + original + " НЕ является палиндромом.");
        }
    }
}