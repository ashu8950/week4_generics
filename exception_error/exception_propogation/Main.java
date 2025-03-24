package exception_error.exception_propogation;

public class Main {
	 public static void main(String[] args) {
	       try {
	            ExceptionPropagation.method2(); // Calls method2, which eventually throws the exception
	        } catch (ArithmeticException e) {
	            System.out.println("Handled exception in main");
	        }
	    }
}
