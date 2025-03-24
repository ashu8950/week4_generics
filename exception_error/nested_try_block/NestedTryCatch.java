package exception_error.nested_try_block;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter the index of the array: ");
            int index = sc.nextInt();

            // Outer try block to handle array index issue
            try {
                int element = numbers[index]; // may throw ArrayIndexOutOfBoundsException

                System.out.print("Enter the divisor: ");
                int divisor = sc.nextInt();

                // Inner try block to handle division issue
                try {
                    int result = element / divisor; // may throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            System.out.println("Operation finished.");
            sc.close();
        }
    }
}
