import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Variables to track the number of heads and tails
        int headsCount = 0;
        int tailsCount = 0;

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Toss the coin and count the result
                    boolean isHeads = flip();
                    if (isHeads) {
                        headsCount++;
                        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
                    } else {
                        tailsCount++;
                        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
                    }
                    break;
                case 2:
                    // Exit the program
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        }
        scanner.close();
    }

    // Method to simulate coin toss
    public static boolean flip() {
        Random random = new Random();
        return random.nextBoolean(); // returns true for heads, false for tails
    }
}