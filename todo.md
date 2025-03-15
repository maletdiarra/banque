# TODO List pour le système de gestion bancaire

## 1. Connexion au système

- [ ] **Saisie des informations de connexion** :
  - [ ] Demander à l'utilisateur de saisir son login et son mot de passe.
- [ ] **Vérification des informations** :
  - [ ] Vérifier si le login et le mot de passe correspondent à un utilisateur dans `users.txt`.
- [ ] **Gestion des erreurs** :
  - [ ] Afficher un message d'erreur si les informations de connexion sont incorrectes.
  - [ ] Limiter le nombre de tentatives de connexion (par exemple, 3 tentatives maximum).

## 2. Vérification du statut d'employé

- [ ] **Vérifier si l'utilisateur est un employé d'une entreprise** :
  - [ ] Consulter le fichier `companies_employees.txt` pour vérifier si l'utilisateur est associé à une entreprise.
- [ ] **Proposer le choix de compte** :
  - [ ] Si l'utilisateur est un employé, lui proposer de choisir entre son compte personnel ou le compte de l'entreprise.

## 3. Menu utilisateur (compte personnel)

- [ ] **Afficher le menu utilisateur** :
  - [ ] Proposer les options suivantes :
    - [ ] Dépôt
    - Retrait
    - Transfert
    - Consulter le solde
- [ ] **Gérer les opérations** :
  - **Dépôt** :
    - [ ] Saisir le montant à déposer.
    - [ ] Mettre à jour le solde du compte.
    - [ ] Enregistrer la transaction dans `transactions.txt`.
  - **Retrait** :
    - [ ] Saisir le montant à retirer.
    - [ ] Vérifier que le montant ne dépasse pas le solde et la limite quotidienne.
    - [ ] Mettre à jour le solde du compte.
    - [ ] Enregistrer la transaction dans `transactions.txt`.
  - **Transfert** :
    - [ ] Saisir le montant à transférer et l'ID du destinataire.
    - [ ] Vérifier que le montant ne dépasse pas le solde et la limite quotidienne.
    - [ ] Mettre à jour les soldes des comptes source et destinataire.
    - [ ] Enregistrer la transaction dans `transactions.txt`.
  - **Consulter le solde** :
    - [ ] Afficher le solde actuel du compte.
    - [ ] Afficher l'historique des transactions.

## 4. Menu entreprise (compte entreprise)

- [ ] **Afficher le menu entreprise** :
  - [ ] Proposer les options suivantes :
    - [ ] Dépôt
    - [ ] Retrait
    - [ ] Transfert
    - [ ] Consulter le solde
    - [ ] Demander un prêt
- [ ] **Gérer les opérations** :
  - **Dépôt** :
    - [ ] Saisir le montant à déposer.
    - [ ] Mettre à jour le solde du compte.
    - [ ] Enregistrer la transaction dans `transactions.txt`.
  - **Retrait** :
    - [ ] Saisir le montant à retirer.
    - [ ] Vérifier que le montant ne dépasse pas le solde et la limite quotidienne.
    - [ ] Mettre à jour le solde du compte.
    - [ ] Enregistrer la transaction dans `transactions.txt`.
  - **Transfert** :
    - [ ] Saisir le montant à transférer et l'ID du destinataire.
    - [ ] Vérifier que le montant ne dépasse pas le solde et la limite quotidienne.
    - [ ] Mettre à jour les soldes des comptes source et destinataire.
    - [ ] Enregistrer la transaction dans `transactions.txt`.
  - **Consulter le solde** :
    - [ ] Afficher le solde actuel du compte.
    - [ ] Afficher l'historique des transactions.
  - **Demander un prêt** :
    - [ ] Saisir les détails du prêt (montant, durée, etc.).
    - [ ] Envoyer la demande à l'employé bancaire pour approbation.

## 5. Gestion des erreurs et validations

- [ ] **Vérifier les limites de retrait** :
  - [ ] S'assurer que le montant du retrait ne dépasse pas le solde du compte et la limite quotidienne.
- [ ] **Gérer les échecs de connexion** :
  - [ ] Limiter le nombre de tentatives de connexion (par exemple, 3 tentatives maximum).
  - [ ] Bloquer le compte après plusieurs échecs.
- [ ] **Valider les transactions** :
  - [ ] Vérifier que les montants saisis sont valides (positifs et dans les limites autorisées).

## 6. Gestion des fichiers

- [ ] **Lire les fichiers** :
  - [ ] Lire les fichiers `users.txt`, `companies.txt`, et `companies_employees.txt` pour vérifier les informations de connexion et les associations entre utilisateurs et entreprises.
- [ ] **Écrire dans les fichiers** :
  - [ ] Mettre à jour les fichiers `users.txt`, `companies.txt`, et `transactions.txt` après chaque opération (dépôt, retrait, transfert).
- [ ] **Gérer les fichiers de cartes** :
  - [ ] Lire et écrire dans `cards.txt` pour gérer les cartes bancaires et les codes PIN.

## 7. Fonctionnalités supplémentaires

- [ ] **Geler ou fermer un compte** :
  - [ ] Permettre à l'employé bancaire de geler ou fermer un compte en cas de fraude ou d'inactivité.
- [ ] **Approuver ou rejeter les demandes de prêt** :
  - [ ] Permettre à l'employé bancaire de gérer les demandes de prêt des entreprises.
- [ ] **Consulter l'historique des transactions** :
  - [ ] Permettre à l'employé bancaire de consulter l'historique des transactions pour un compte spécifique.

## 8. Tests et validation

- [ ] **Tester la connexion** :
  - [ ] Vérifier que seuls les utilisateurs valides peuvent se connecter.
- [ ] **Tester les opérations** :
  - [ ] Vérifier que les opérations (dépôt, retrait, transfert) fonctionnent correctement et que les soldes sont mis à jour.
- [ ] **Tester les limites** :
  - [ ] Vérifier que les limites de retrait quotidien sont respectées.
- [ ] **Tester les erreurs** :
  - [ ] Vérifier que les messages d'erreur sont affichés correctement en cas d'opération invalide.
- [ ] **Tester la déconnexion** :
  - [ ] Vérifier que la déconnexion fonctionne correctement.
- [ ] **Tester la gestion des fichiers** :
  - [ ] Vérifier que les fichiers `users.txt`, `companies.txt`, `companies_employees.txt`, `cards.txt` et `transactions.txt` sont correctement lus et écrits.