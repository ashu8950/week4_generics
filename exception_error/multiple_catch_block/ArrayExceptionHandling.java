package exception_error.multiple_catch_block;

import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // You can set this to null to test NullPointerException
        int[] numbers = {10, 20, 30, 40, 50}; 
        

        try {
            // Get index input
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            // Attempt to access value at index
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}

