package hw_4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Enter words one by one. Type STOP to finish:");

        while (true) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            sentence.append(word).append(" ");
        }

        System.out.println("\nFinal sentence:");
        System.out.println(sentence.toString().trim());
    }
}