# Interface de Connexion avec Base de Données

Ce projet est une interface Java Swing permettant d'insérer des utilisateurs (nom d'utilisateur et mot de passe) dans une base de données MySQL.

## Prérequis

- **Java JDK** installé (version 8 ou supérieure).
- **NetBeans IDE** pour exécuter et modifier le projet.
- **MySQL** et **phpMyAdmin** pour gérer la base de données.

## Installation

### Étape 1 : Configuration de la base de données
1. Accédez à **phpMyAdmin** dans votre navigateur.
2. Cliquez sur **Importer** dans le menu de votre base de données.
3. Téléchargez le fichier `base_de_donnees.sql` fourni avec ce projet.
4. Une fois le fichier importé, la base de données et la table seront automatiquement créées.

### Étape 2 : Configuration du projet Java
1. Ouvrez le projet dans **NetBeans**.
2. Assurez-vous que le fichier **JDBC Driver** (`mysql-connector-java-x.x.x.jar`) est déjà inclus dans le projet.
3. Vérifiez la configuration de connexion dans le fichier Java `InterfaceDeConnexion.java` :
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/interface_de_connexion";
   private static final String USER = "root";
   private static final String PASSWORD = "";
   ```
   > Remplacez `root` et le mot de passe vide (`""`) par vos identifiants MySQL si nécessaire.

## Utilisation

1. Exécutez le projet dans **NetBeans**.
2. Une interface s'ouvre avec les champs `Utilisateur` et `Mot de passe`.
3. Entrez un nom d'utilisateur et un mot de passe, puis cliquez sur **Connecter** :
   - Les données seront insérées dans la base de données.
   - Un message de succès s'affichera.
4. Cliquez sur **Annuler** pour fermer l'application.

---

## Structure des fichiers

- **InterfaceDeConnexionAvecBaseDeDonnées** : Code source principal.
- **base_de_donnees.sql** : Fichier pour importer la base de données.
- **README.md** : Instructions pour installer et utiliser le projet.

---
