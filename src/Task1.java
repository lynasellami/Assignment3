import java.util.Scanner;

public class Task1 {

    // Method 1: Addition of two numbers
    public static double calcResult(double num1, double num2) {
        return num1 + num2;
    }

    // Method 2: Calculation based on operator
    public static double calcResult(double num1, double num2, char oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
            default:
                System.out.println("Invalid operator!");
                return 0;
        }
    }

    // Method 3: Parsing formula and calculating result
    public static double calcResult(String formula) {
        String[] parts = formula.split(" ");
        double num1 = Double.parseDouble(parts[0]);
        char oper = parts[1].charAt(0);
        double num2 = Double.parseDouble(parts[2]);

        return calcResult(num1, num2, oper);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs from user
        System.out.print("Please enter two numbers, separated by space: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.print("Please enter the operator (+, -, *, or /): ");
        char oper = scanner.next().charAt(0);

        System.out.print("Please enter a formula, e.g.: \"15.78 / 4.19\": ");
        scanner.nextLine(); // Consume newline
        String formula = scanner.nextLine();
        // Calling the methods and formatting the output to two decimal places
        System.out.printf("Calling the first method : %.2f + %.2f = %.2f%n", num1, num2, calcResult(num1, num2));
        System.out.printf("Calling the second method : %.2f %c %.2f = %.2f%n", num1, oper, num2, calcResult(num1, num2, oper));
        System.out.printf("Calling the third method : %s = %.2f%n", formula, calcResult(formula));
    }
}