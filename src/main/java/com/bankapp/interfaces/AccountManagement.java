package com.bankapp.interfaces;
import com.bankapp.models.Client;

public interface AccountManagement {
    void freezeAccount(Client client);
    void closeAccount(Client client);
}
