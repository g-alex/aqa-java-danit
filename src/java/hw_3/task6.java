package hw_3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Какая программа вас интересует (IntelliJ IDEA, Git, Java)? ");
        String program = scanner.nextLine();

        System.out.print("Какую ОС вы используете (Linux, MacOS, Windows)? ");
        String os = scanner.nextLine();

        // Используем switch по программе
        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        System.out.println("Ссылка: https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case "MacOS":
                        System.out.println("Ссылка: https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case "Windows":
                        System.out.println("Ссылка: https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;

            case "Git":
                switch (os) {
                    case "Linux":
                        System.out.println("Ссылка: https://git-scm.com/download/linux");
                        break;
                    case "MacOS":
                        System.out.println("Ссылка: https://git-scm.com/download/mac");
                        break;
                    case "Windows":
                        System.out.println("Ссылка: https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;

            case "Java":
                switch (os) {
                    case "Linux":
                        System.out.println("Ссылка: https://www.oracle.com/java/technologies/downloads/#downloads-linux");
                        break;
                    case "MacOS":
                        System.out.println("Ссылка: https://www.oracle.com/java/technologies/downloads/#downloads-mac");
                        break;
                    case "Windows":
                        System.out.println("Ссылка: https://www.oracle.com/java/technologies/downloads/#downloads-windows");
                        break;
                    default:
                        System.out.println("Такой ОС не существует.");
                        break;
                }
                break;

            default:
                System.out.println("Такой программы не существует.");
                break;
        }

        scanner.close();
    }
}