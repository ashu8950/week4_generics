package exception_error.throw_throws;

public class InterestCalculator {

    // Method that might throw an exception – declared using 'throws'
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // 'throw' is used to explicitly throw the exception
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Simple Interest Formula: (P * R * T) / 100
        return (amount * rate * years) / 100;
    }
}