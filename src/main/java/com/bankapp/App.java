package com.bankapp;

import java.io.FileNotFoundException;

import com.bankapp.services.Connection;
import com.bankapp.services.Session;

/**
 * Hello world!
 *
 */
public class App {
    private Session session;

    public App() {
        this.session = new Session();
    }

    public static void main(String[] args) throws FileNotFoundException {
        App app = new App();
        Connection connect = new Connection();
        if (connect.login("emily", "password654")) {
            app.session.setCurrentUser(connect.getCurrentUser());
            System.out.println("Bienvenue : " + app.session.getCurrentUser().getLogin());

        }
    }
}
