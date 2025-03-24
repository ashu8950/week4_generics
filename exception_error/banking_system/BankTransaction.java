package exception_error.banking_system;

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // initial balance

        try {
            account.withdraw(1000);  // ✅ valid
            account.withdraw(-200);  // ❌ invalid amount
            account.withdraw(6000);  // ❌ exceeds balance
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
