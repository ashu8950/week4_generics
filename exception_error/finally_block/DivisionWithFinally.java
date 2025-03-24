package exception_error.finally_block;

import java.util.Scanner;

public class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking two integers from the user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Cannot divide by zero.");
        }
        finally {
            // Always executed
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}
