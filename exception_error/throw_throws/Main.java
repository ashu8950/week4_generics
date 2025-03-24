package exception_error.throw_throws;

public class Main {

	 public static void main(String[] args) {
		 
	      try {
	            double interest = InterestCalculator.calculateInterest(5000, 5, 2);
	            System.out.println("Interest: " + interest);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid input: " + e.getMessage());
	        }
	    }
}
