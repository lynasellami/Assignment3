import java.util.Scanner;

public class Task2 {

    // Method to convert a word to TitleCase
    public static String convertCase(String word) {
        return toTitleCase(word);
    }

    // Method to convert a word to a specific case based on the caseType parameter
    public static String convertCase(String word, char caseType) {
        switch (caseType) {
            case 'U': return word.toUpperCase();
            case 'L': return word.toLowerCase();
            case 'T': return toTitleCase(word);
            default: return word;
        }
    }

    // Helper method to convert a word to TitleCase (first letter uppercase, the rest lowercase)
    private static String toTitleCase(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        // Asking the user to choose the case type
        System.out.println("Please choose the case you want to convert:");
        System.out.println("1. 'l' or 'L' for lowercase");
        System.out.println("2. 'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase");

        char caseType = scanner.nextLine().charAt(0);
        caseType = Character.toUpperCase(caseType); // Convert the caseType to uppercase for easy handling
        scanner.nextLine();

        // Print the original word
        System.out.printf("%-37s: %s%n", "Original word", word);

        // Call the first convertCase method
        System.out.printf("%-37s: %s%n", "Calling the first convertCase method", convertCase(word));

        // Call the second convertCase method with the selected case type
        System.out.printf("%-37s: %s%n", "Calling the second convertCase method", convertCase(word, caseType));
    }
}