package com.bankapp.services;
import com.bankapp.models.User;

public class Session {
    private User currentUser;

    public User getCurrentUser() {
        return this.currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    /*Vide la session*/
    public void clean(){
        this.currentUser = null;
    }
    /*Vérifier s'il y aun User dans la session*/
    public boolean isLoggedIn(){
        return this.currentUser != null;/*1 == il y a un user connecté; 0 == la session est vide*/
    }

    
}
