package hw_3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        int a = scanner.nextInt();

        System.out.print("Введите сторону b: ");
        int b = scanner.nextInt();

        System.out.print("Введите сторону c: ");
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Из этих сторон МОЖНО построить треугольник.");
        } else {
            System.out.println("Из этих сторон НЕЛЬЗЯ построить треугольник.");
        }

        scanner.close();
    }
}