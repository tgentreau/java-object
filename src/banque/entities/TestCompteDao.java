package banque.entities;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TestCompteDao {
    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu() {

        CompteDao compteDAO = new CompteDaoMem();
        String rep;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("**** Administration des comptes ****");
            System.out.println("1: Lister les comptes");
            System.out.println("2: Ajouter un compte");
            System.out.println("3: Ajouter une opération à un compte");
            System.out.println("4: Supprimer un compte");
            System.out.println("99: Quitter");
            rep = scanner.nextLine();
            if (Objects.equals(rep, "1")) {
                ArrayList<Compte> compte = compteDAO.lister();
                if(compte.size() == 0) {
                    System.out.println("Aucun compte enregistré");
                } else {
                    System.out.println(compte);
                }
            } else if (Objects.equals(rep, "2")) {
                System.out.println("Veuillez saisir le numéro");
                String numCompte = scanner.nextLine();
                System.out.println("Veuillez saisir le solde initial");
                String solde = scanner.nextLine();
                System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
                String typeCompte = scanner.nextLine();
                if (Objects.equals(typeCompte, "1")) {
                    Compte nouveauCompte = new Compte(numCompte, Double.parseDouble(solde));
                    compteDAO.sauvegarder(nouveauCompte);
                } else if (Objects.equals(typeCompte, "2")) {
                    System.out.println("Veuillez saisir le taux");
                    String taux = scanner.nextLine();
                    Compte nouveauCompte = new CompteTaux(numCompte, Double.parseDouble(solde), Double.parseDouble(taux));
                    compteDAO.sauvegarder(nouveauCompte);
                } else {
                    System.out.println("Mauvaise entrée");
                }
            } else if (Objects.equals(rep, "3")) {
                System.out.println("Veuillez choisir le numéro de compte concerné :");
                String numeroCompte = scanner.nextLine();
                compteDAO.existe(numeroCompte);
            } else if (Objects.equals(rep, "4")) {
                System.out.println("Veuillez saisir le numéro de compte à supprimer:");
                String numCompte = scanner.nextLine();
                compteDAO.supprimer(numCompte);
            } else if(Objects.equals(rep, "99")) {
                System.out.println("Aurevoir");
                scanner.close();
            }
//            else if(rep == "4") {
//                System.out.println("Veuillez choisir le numéro de compte concerné :");
//                String numCompte = scanner.nextLine();
//                boolean exist = compteDAO.existe(numCompte);
//                if(exist) {
//                    System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT): ");
//                    String typeOP = scanner.nextLine();
//                    System.out.println("Veuillez saisir la date :");
//                    String dateOP = scanner.nextLine();
//                    System.out.println("Veuillez saisir le montant :");
//                    String montantOP = scanner.nextLine();
//                } else {
//                    System.out.println("Le compte n'existe pas");
//                }
//
//
//            }
        } while (!Objects.equals(rep, "99"));
    }
}
