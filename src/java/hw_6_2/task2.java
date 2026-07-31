package hw_6_2;

interface TextProcessor {
    String process(String text);

    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}

class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}

class ReverseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

class TrimProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.trim();
    }
}

public class task2 {
    public static void main(String[] args) {
        UpperCaseProcessor upperProcessor = new UpperCaseProcessor();
        ReverseProcessor reverseProcessor = new ReverseProcessor();
        TrimProcessor trimProcessor = new TrimProcessor();

        String testText = "  Привет. Ментор. Как дела?.  ";

        System.out.println("Исходный текст: \"" + testText + "\"\n");

        System.out.println("1. UpperCaseProcessor:");
        System.out.println("Результат process: " + upperProcessor.process(testText));
        System.out.println("Результат removeDigits (без точек): " + upperProcessor.removeDigits(testText));

        System.out.println("\n2. ReverseProcessor:");
        System.out.println("Результат process: " + reverseProcessor.process(testText));
        System.out.println("Результат removeDigits (без точек): " + reverseProcessor.removeDigits(testText));

        System.out.println("\n3. TrimProcessor:");
        System.out.println("Результат process: \"" + trimProcessor.process(testText) + "\"");
        System.out.println("Результат removeDigits (без точек): \"" + trimProcessor.removeDigits(testText) + "\"");
    }
}