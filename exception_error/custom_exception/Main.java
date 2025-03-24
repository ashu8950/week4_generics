package exception_error.custom_exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter age :");
			int age = sc.nextInt();
			//calling the method
			ValidAge.validateAge(age);
		}
		 catch (InvalidAgeException e) {
	           System.out.println(e.getMessage());
	   } catch (Exception e) {
	           System.out.println("Invalid input.");
	     } finally {
	          sc.close();
	    }
	}

}
