package com.bankapp;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bankapp.models.CompanyClient;
import com.bankapp.models.User;
import com.bankapp.models.UserClient;
import com.bankapp.services.Connection;
import com.bankapp.services.Session;

/**
 * Hello world!
 *
 */
public class App {
    private Session session;
    private Connection connect;

    public App() {
        this.session = new Session();
        try {
            this.connect = new Connection();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        App app = new App();

        app.displayMenu();

    }

    private void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (!session.isLoggedIn()) {
            User currentUser = session.getCurrentUser();
            System.out.println("1. Se connecter");
            System.out.println("2. Créer un compte");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Nom d'utilisateur: ");
                String username = scanner.nextLine();
                System.out.print("Mot de passe: ");
                String password = scanner.nextLine();
                if (connect.login(username, password)) {
                    try {
                        this.session.setCurrentUser(connect.getCurrentUser());
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("Bienvenue " + this.session.getCurrentUser().getLogin());

                }
                session.setCurrentUser(currentUser);
                if (!session.isLoggedIn()) {
                    System.out.println("Nom d'utilisateur ou mot de passe incorrect.");
                }
            } else if (choice == 2) {
                System.out.println("1. Particulier");
                /* TODO: A revoir */
                System.out.println("2. Entreprise");
                System.out.print("Choisissez une option: ");
                int choiceCreate = scanner.nextInt();
                scanner.nextLine(); // consume newline

                // while (currentUser == null) {
                // if (choiceCreate == 1) {
                // System.out.print("Nom d'utilisateur: ");
                // String username = scanner.nextLine();
                // System.out.print("Mot de passe: ");
                // String password = scanner.nextLine();
                // User user = new UserClient();
                // user.setLogin(username);
                // user.setPassword(password);
                // currentUser = user;
                // if (authService.register(user)) {
                // System.out.println("Compte créé avec succès.");
                // } else {
                // System.out.println("Nom d'utilisateur déjà pris.");
                // }
                // } else if (choiceCreate == 2) {
                // System.out.print("Nom d'utilisateur: ");
                // String username = scanner.nextLine();
                // System.out.print("Mot de passe: ");
                // String password = scanner.nextLine();
                // User user = new CompanyClient();
                // user.setLogin(username);
                // user.setPassword(password);
                // currentUser = user;
                // if (authService.register(user)) {
                // System.out.println("Compte créé avec succès.");
                // } else {
                // System.out.println("Nom d'utilisateur déjà pris.");
                // }
                // } else {
                // System.out.println("Option invalide.");

                // }
                // }
            } else {
                System.out.println("Option invalide.");
            }
        }
        displayMenu();
    }

    private void displayUserMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Afficher les informations du compte");
            System.out.println("2. Déconnexion");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                // displayAccountInfo();
            } else if (choice == 2) {
                session.clean();
                System.out.println("Déconnecté avec succès.");
                displayMenu();
                break;
            } else {
                System.out.println("Option invalide.");
            }
        }
    }
}
