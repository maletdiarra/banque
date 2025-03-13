package com.bankapp.interfaces;
import com.bankapp.models.CompanyClient;

public interface LoanApproval {
    void approveLoan(CompanyClient company);
    void rejectLoan(CompanyClient company);
}
