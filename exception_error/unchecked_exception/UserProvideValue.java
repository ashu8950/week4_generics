package exception_error.unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserProvideValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter first num1 :");
			int num1 = sc.nextInt();
			
			System.out.println("Enter first num2 :");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			
			System.out.println("Successfully executed:3 "+ result);
			
			
		}
		 catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero.");
	        }
	     catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter numeric values only.");
	        }
	     finally {
	            sc.close(); // Always close the scanner
	    }
	}

}
