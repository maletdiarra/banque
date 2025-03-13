package com.bankapp.interfaces;
import com.bankapp.models.Account;

public interface Loanable {
    void requestLoan(double amount, Account account);
}
