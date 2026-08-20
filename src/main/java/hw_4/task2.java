package hw_4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check for palindrome: ");
        String original = scanner.next();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Number " + original + " is a palindrome!");
        } else {
            System.out.println("Number " + original + " is NOT a palindrome.");
        }
    }
}