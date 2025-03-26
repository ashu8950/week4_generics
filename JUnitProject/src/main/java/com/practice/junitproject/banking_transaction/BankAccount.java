package com.practice.junitproject.banking_transaction;

public class BankAccount {
    private double balance;

    /**
     * Constructor to initialize the bank account with a starting balance.
     * @param initialBalance The initial balance of the account.
     */
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    /**
     * Deposits money into the account.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    /**
     * Withdraws money from the account.
     * @param amount The amount to withdraw.
     * @throws IllegalArgumentException if funds are insufficient.
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    /**
     * Returns the current balance.
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }
}

