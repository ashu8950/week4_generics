package collection_framework.projects.banking_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {
	private HashMap<Integer, Double> accounts = new HashMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Create or update an account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Queue a withdrawal request
    public void requestWithdrawal(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("❌ Account not found: " + accountNumber);
            return;
        }
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }

    // Process all withdrawals in order
    public void processWithdrawals() {
        System.out.println("Processing Withdrawals...");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            double currentBalance = accounts.get(request.accountNumber);
            if (request.amount <= currentBalance) {
                accounts.put(request.accountNumber, currentBalance - request.amount);
                System.out.printf("Account %d: Withdrawn $%.2f | New Balance: $%.2f\n",
                        request.accountNumber, request.amount, accounts.get(request.accountNumber));
            } else {
                System.out.printf("Account %d: Insufficient funds for $%.2f\n",
                        request.accountNumber, request.amount);
            }
        }
    }

    // Display all accounts sorted by balance
    public void displayAccountsByBalance() {
        TreeMap<Double, List<Integer>> sorted = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sorted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : sorted.entrySet()) {
            for (Integer accNum : entry.getValue()) {
                System.out.printf("Account %d → $%.2f\n", accNum, entry.getKey());
            }
        }
    }
}
