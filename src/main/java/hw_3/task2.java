package hw_3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();

        System.out.print("Enter side b: ");
        int b = scanner.nextInt();

        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("It IS POSSIBLE to build a triangle from these sides.");
        } else {
            System.out.println("It is NOT POSSIBLE to build a triangle from these sides.");
        }

        scanner.close();
    }
}