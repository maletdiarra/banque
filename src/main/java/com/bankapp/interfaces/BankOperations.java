package com.bankapp.interfaces;

public interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
    void viewTransactionHistory();
}
