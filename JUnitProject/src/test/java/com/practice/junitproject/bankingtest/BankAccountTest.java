package com.practice.junitproject.bankingtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practice.junitproject.banking_transaction.BankAccount;

class BankAccountTest {
    private BankAccount account;

    /**
     * Initializes a bank account with a balance of 100 before each test.
     */
    @BeforeEach
    void setUp() {
        account = new BankAccount(100);
    }

    /**
     * Tests deposit functionality.
     */
    @Test
    void testDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Balance should increase after deposit");
    }

    /**
     * Tests withdrawal functionality.
     */
    @Test
    void testWithdraw() {
        account.withdraw(30);
        assertEquals(70, account.getBalance(), "Balance should decrease after withdrawal");
    }

    /**
     * Ensures withdrawals fail if funds are insufficient.
     */
    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200),
                     "Should throw exception for insufficient funds");
    }

    /**
     * Ensures deposits with negative values are not allowed.
     */
    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10),
                     "Should throw exception for negative deposits");
    }

    /**
     * Ensures withdrawals with negative values are not allowed.
     */
    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5),
                     "Should throw exception for negative withdrawals");
    }
}
