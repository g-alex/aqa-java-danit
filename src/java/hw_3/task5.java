package hw_3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, %, /): ");
        char op = scanner.next().charAt(0);

        double result = (op == '+') ? (a + b) :
                (op == '-') ? (a - b) :
                        (op == '*') ? (a * b) :
                                (op == '%') ? (a % b) :
                                        (op == '/') ? (b != 0 ? a / b : 0) : 0;

        System.out.println("Результат: " + result);

        scanner.close();
    }
}