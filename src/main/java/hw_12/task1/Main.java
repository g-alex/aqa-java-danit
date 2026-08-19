package hw_12.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int one;
            int two;
            String operation;

            try {
                System.out.println("Write number one");
                one = parse(scanner.nextLine());

                System.out.println("Write number Two");
                two = parse(scanner.nextLine());

                System.out.println("Write operation");
                operation = scanner.nextLine();

                Calculator calculator = new Calculator(one, two, operation);
                int result = calculator.calculate();
                System.out.println(result);
            } catch (InvalidInputException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (DivisionByZeroException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (UnknownCalculatorException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Unknown Error");
            } finally {
                System.out.println("Continue ?");
                String answer = scanner.nextLine();
                if (answer.equals("no")) {
                    break;
                }
            }

        }
    }

    public static int parse(String number) {

        try {
            int num = Integer.parseInt(number);
            return num;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Put only number");
        }

    }
}
