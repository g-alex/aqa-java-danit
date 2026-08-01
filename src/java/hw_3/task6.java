package hw_3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which program interests you (IntelliJ IDEA, Git, Java)? ");
        String program = scanner.nextLine();

        System.out.print("Which OS do you use (Linux, MacOS, Windows)? ");
        String os = scanner.nextLine();
        
        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        System.out.println("Link: https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case "MacOS":
                        System.out.println("Link: https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case "Windows":
                        System.out.println("Link: https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Such an OS does not exist.");
                        break;
                }
                break;

            case "Git":
                switch (os) {
                    case "Linux":
                        System.out.println("Link: https://git-scm.com/download/linux");
                        break;
                    case "MacOS":
                        System.out.println("Link: https://git-scm.com/download/mac");
                        break;
                    case "Windows":
                        System.out.println("Link: https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Such an OS does not exist.");
                        break;
                }
                break;

            case "Java":
                switch (os) {
                    case "Linux":
                        System.out.println("Link: https://www.oracle.com/java/technologies/downloads/#downloads-linux");
                        break;
                    case "MacOS":
                        System.out.println("Link: https://www.oracle.com/java/technologies/downloads/#downloads-mac");
                        break;
                    case "Windows":
                        System.out.println("Link: https://www.oracle.com/java/technologies/downloads/#downloads-windows");
                        break;
                    default:
                        System.out.println("Such an OS does not exist.");
                        break;
                }
                break;

            default:
                System.out.println("Such a program does not exist.");
                break;
        }

        scanner.close();
    }
}