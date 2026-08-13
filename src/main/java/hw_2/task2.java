package hw_2;

public class task2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        String[] words = string.split("[,\\s]+");

        for (int i = 0; i < words.length; i++) {
            System.out.println("Word" + (i + 1) + " = " + words[i] +
                    ", Length of this word = " + words[i].length());
        }


        int firstWordLength = words[0].length();
        boolean isFirstLongest = true;

        for (int i = 1; i < words.length; i++) {
            if (firstWordLength <= words[i].length()) {
                isFirstLongest = false;
                break;
            }
        }

        System.out.println("\nThe first word is longer than others: " + isFirstLongest);
    }
}
