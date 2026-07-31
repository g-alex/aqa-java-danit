package hw_4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Вводите слова по одному. Для завершения введите STOP:");

        while (true) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            sentence.append(word).append(" ");
        }

        System.out.println("\nИтоговое предложение:");
        System.out.println(sentence.toString().trim());
    }
}