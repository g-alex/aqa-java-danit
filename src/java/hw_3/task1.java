package hw_3;

import java.util.Scanner;

public class task1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: I am testing wonderfully. What else is needed?");

        String string1 = scanner.next();

        String string2 = scanner.next();

        String string3 = scanner.next();

        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);

        scanner.close();
    }
}