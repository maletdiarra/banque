package com.bankapp.services;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import com.bankapp.models.User;
import com.bankapp.models.UserClient;
import com.bankapp.storage.Storage;

public class Connection {
    private Scanner userScanner;
    private HashMap<String, User> usersDatabase;
    private User currentUser;

    public Connection() throws FileNotFoundException{
        this.usersDatabase = loadUsersData("src/main/data/users.txt");
    }
    public void logout() {
        if (this.currentUser != null) {
            System.out.println("Deconnexion de l'utilisateur: " + this.currentUser.getLogin());
            this.currentUser = null; 
        } else {
            System.out.println("pas d'utilisateur connecte.");
        }
    }

    public boolean login(String login, String password) {
        User user = this.usersDatabase.get(login);
        if (user != null && user.getPassword().equals(password)) {
            this.currentUser = user;
            System.out.println("Connexion reussi: " + login);
            return true;
        } else {
            System.out.println("login ou mot de passe erroné.");
            return false;
        }
    }

    private HashMap<String, User> loadUsersData(String filePath) throws FileNotFoundException {
        HashMap<String, User> usersMap = new HashMap<>();
        try {
            this.userScanner = new Storage().reader(filePath);
            while (userScanner.hasNextLine()) {
                String[] parts = this.userScanner.nextLine().split(", ");
                if (parts.length == 3) {
                    UserClient client = new UserClient();
                    client.setId(Integer.parseInt(parts[0]));
                    client.setLogin(parts[1]);
                    client.setPassword(parts[2]);
                    usersMap.put(parts[1], client);
                }
            }
        } finally {
            if (this.userScanner != null) {
                this.userScanner.close(); 
            }
        }
        return usersMap;
    }

    public User getCurrentUser() {
        return this.currentUser;
    }
}
