package exception_error.exception_propogation;

public class ExceptionPropagation {

    // Method that throws ArithmeticException
    public static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1(); // No try-catch here, so exception will propagate
    }
}

