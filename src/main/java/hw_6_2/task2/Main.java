package hw_6_2.task2;

public class Main {
    public static void main(String[] args) {
        UpperCaseProcessor upperProcessor = new UpperCaseProcessor();
        ReverseProcessor reverseProcessor = new ReverseProcessor();
        TrimProcessor trimProcessor = new TrimProcessor();

        String testText = "  Hello. Mentor. How are you?.  ";

        System.out.println("Original text: \"" + testText + "\"\n");

        System.out.println("1. UpperCaseProcessor:");
        System.out.println("Result of process: " + upperProcessor.process(testText));
        System.out.println("Result of removeDigits (without dots): " + upperProcessor.removeDigits(testText));

        System.out.println("\n2. ReverseProcessor:");
        System.out.println("Result of process: " + reverseProcessor.process(testText));
        System.out.println("Result of removeDigits (without dots): " + reverseProcessor.removeDigits(testText));

        System.out.println("\n3. TrimProcessor:");
        System.out.println("Result of process: \"" + trimProcessor.process(testText) + "\"");
        System.out.println("Result of removeDigits (without dots): \"" + trimProcessor.removeDigits(testText) + "\"");
    }
}