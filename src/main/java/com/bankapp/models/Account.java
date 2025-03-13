package com.bankapp.models;

public class Account {
    private int id;
    private String accountNumber;
    private double balance;
    private String accountType;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return this.accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    

}
