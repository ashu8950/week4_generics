package collection_framework.projects.banking_system;

public class Main {
	 public static void main(String[] args) {
	        BankingSystem bank = new BankingSystem();

	        // Add accounts
	        bank.addAccount(101, 1000.0);
	        bank.addAccount(102, 500.0);
	        bank.addAccount(103, 1500.0);
	        bank.addAccount(104, 300.0);

	        // Make withdrawal requests
	        bank.requestWithdrawal(102, 200.0);
	        bank.requestWithdrawal(101, 1100.0); // should fail
	        bank.requestWithdrawal(103, 1000.0);

	        // Process queue
	        bank.processWithdrawals();

	        // Show accounts sorted by balance
	        bank.displayAccountsByBalance();
	    }
}
