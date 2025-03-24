package exception_error.custom_exception;

public class ValidAge {
	//validating age and throws excepiton that might can occur
	public static void validateAge(int age)throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Under age");
		}
		else {
			System.out.println("Valid age");
		}
	}
}
