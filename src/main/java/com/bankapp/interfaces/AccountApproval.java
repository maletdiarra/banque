package com.bankapp.interfaces;
import com.bankapp.models.Client;

public interface AccountApproval {
    void approveAccount(Client client);
    void rejectAccount(Client client);
}
