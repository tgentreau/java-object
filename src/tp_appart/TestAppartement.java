package tp_appart;

import tp_appart.dao.LogementDAO;
import tp_appart.entities.*;
import tp_appart.exeptions.AlreadyReservedExeption;
import tp_appart.exeptions.SurCapaciteExeption;
import tp_appart.service.ReservationService;

import java.util.List;

public class TestAppartement {
    static LogementDAO logementDAO = new LogementDAO();
    static ReservationService reservationService = new ReservationService(logementDAO);
    public static void main(String[] args)  throws AlreadyReservedExeption, SurCapaciteExeption {
        Appartement appartement1 = new Appartement(1, 50, new Adresse(14, "rue du chêne", 40100, "Dax"), 3, 2, false);
        Appartement appartement2 = new Appartement(2, 80, new Adresse(5, "rue du bois", 33000, "Bordeaux"), 2, 1, true);
        Maison appartement3 = new Maison(3, 35, new Adresse(18, "rue du pin", 64000, "Bayonne"), 1, false, true);
        Peniche appartement4 = new Peniche(4, 120, new Adresse(24, "rue du cerisier", 95000, "Paris"), 1, true, 5);
        Appartement appartement5 = new Appartement(5, 60, new Adresse(2, "rue du saule pleureur", 59000, "Lille"), 4, 2, false);
        logementDAO.ajouter(appartement1);
        logementDAO.ajouter(appartement2);
        logementDAO.ajouter(appartement3);
        logementDAO.ajouter(appartement4);
        logementDAO.ajouter(appartement5);
        List<Logement> logements = logementDAO.lister();
        System.out.println(logements);


        try{
            reservationService.reserver(logements.get(0), 1);
        } catch (AlreadyReservedExeption e) {
            System.out.println("Logement déjà réserver");
        }

        reservationService.liberer(logements.get(2));
        reservationService.reserver(logements.get(2), 1);

        System.out.printf("appartement disponibles: %s\n", reservationService.listerLogementDisponibles());
        System.out.printf("appartement non disponibles: %s\n", reservationService.listerLogementNonDisponibles());

        try {
            reservationService.reserver(logements.get(1), logements.get(1).nombreMaxPersonne + 1);
        } catch (SurCapaciteExeption e) {
            System.out.println("Appartement en surcapacité, test OK");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Réserver un appartement");
//        System.out.println("1 - Réserver un appartement");
//        System.out.println("2 - Libérer un appartement");
//        System.out.println("3 - Lister les appartement disponnible");
//        System.out.println("4 - Lister les appartements non disponnible");
//        System.out.println("99 - Sortir");
//        String choix = scanner.nextLine();

//        do {
//            switch (choix) {
//                case "1":
//                    for (Appartement appartement : appartementsALoue) {
//                        System.out.println(appartement.toString());
//                    }
//                    System.out.println("Choisissez l'identifiant de l'appartement que vous souhaitez louer'");
//                    String choixReservation = scanner.nextLine();
//                    Appartement appartementLoué = null;
//                    for (Appartement appartement : appartementsALoue) {
//                        appartementLoué = appartement.getById(Integer.parseInt(choixReservation), appartementsALoue);
//                    }
//                    if(appartementLoué == null) {
//                        System.out.println("L'appartement n'existe pas");
//                    }
//                    System.out.println("Veuillez choisir le nombre de personne qui vont loger dans l'appartement");
//                    String choixNbrPersonne = scanner.nextLine();
//                    if(Integer.parseInt(choixNbrPersonne) > appartementLoué.getNombreMaxPersonne()) {
//                        System.out.println("Le nombre de personne maximum pour ce bien est de " + appartementLoué.getNombreMaxPersonne());
//                    } else {
//                        appartementsLoue.add(appartementLoué);
//                        appartementsALoue.remove(appartementLoué);
//                        System.out.println("Appartement réservé");
//                    }
//                case "2":
//                    for (Appartement appartement : appartementsLoue) {
//                        System.out.println(appartement.toString() + "\n");
//                    }
//                    System.out.println("Choisissez l'identifiant de l'appartement que vous souhaitez remettre à louer'");
//                    String choixLiberation = scanner.nextLine();
//                    Appartement appartementALiberer = null;
//                    for (Appartement appartement : appartementsLoue) {
//                        appartementALiberer = appartement.getById(Integer.parseInt(choixLiberation), appartementsLoue);
//                    }
//                    appartementsLoue.remove(appartementALiberer);
//                    appartementsALoue.add(appartementALiberer);
//                    System.out.println("L'appartement a bien été remis en location");
//                case "3":
//                    System.out.println("Voici les appartements disponnible à la location");
//                    for (Appartement appartement : appartementsALoue) {
//                        System.out.println(appartement.toString() + "\n");
//                    }
//                case "4":
//                    System.out.println("Voici les appartements déjà loué");
//                    for (Appartement appartement : appartementsLoue) {
//                        System.out.println(appartement.toString() + "\n");
//                    }
//                case "99":
//                    System.out.println("Aurevoir");
//            }
//
//        } while (!choix.equals("99"));
//
//        while (!choix.equals("99")) {
//            switch (choix) {
//                case "1":
//                    for (Appartement appartement : appartementsALoue) {
//                        System.out.println(appartement.toString());
//                    }
//                    System.out.println("Choisissez l'identifiant de l'appartement que vous souhaitez louer'");
//                    String choixReservation = scanner.nextLine();
//                    Appartement appartementLoué = null;
//                    for (Appartement appartement : appartementsALoue) {
//                        appartementLoué = appartement.getById(Integer.parseInt(choixReservation), appartementsALoue);
//                    }
//                    if (appartementLoué == null) {
//                        System.out.println("L'appartement n'existe pas");
//                    }
//                    System.out.println("Veuillez choisir le nombre de personne qui vont loger dans l'appartement");
//                    String choixNbrPersonne = scanner.nextLine();
//                    if (Integer.parseInt(choixNbrPersonne) > appartementLoué.getNombreMaxPersonne()) {
//                        System.out.println("Le nombre de personne maximum pour ce bien est de " + appartementLoué.getNombreMaxPersonne());
//                    } else {
//                        appartementsLoue.add(appartementLoué);
//                        appartementsALoue.remove(appartementLoué);
//                        System.out.println("Appartement réservé");
//                    }
//                case "2":
//                    for (Appartement appartement : appartementsLoue) {
//                        System.out.println(appartement.toString() + "\n");
//                    }
//                    System.out.println("Choisissez l'identifiant de l'appartement que vous souhaitez remettre à louer'");
//                    String choixLiberation = scanner.nextLine();
//                    Appartement appartementALiberer = null;
//                    for (Appartement appartement : appartementsLoue) {
//                        appartementALiberer = appartement.getById(Integer.parseInt(choixLiberation), appartementsLoue);
//                    }
//                    appartementsLoue.remove(appartementALiberer);
//                    appartementsALoue.add(appartementALiberer);
//                    System.out.println("L'appartement a bien été remis en location");
//                case "3":
//                    System.out.println("Voici les appartements disponnible à la location");
//                    for (Appartement appartement : appartementsALoue) {
//                        System.out.println(appartement.toString() + "\n");
//                    }
//                case "4":
//                    System.out.println("Voici les appartements déjà loué");
//                    for (Appartement appartement : appartementsLoue) {
//                        System.out.println(appartement.toString() + "\n");
//                    }
//                case "99":
//                    System.out.println("Aurevoir");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Réserver un appartement");
//        System.out.println("1 - Réserver un appartement");
//        System.out.println("2 - Libérer un appartement");
//        System.out.println("3 - Lister les appartement disponnible");
//        System.out.println("4 - Lister les appartements non disponnible");
//        System.out.println("99 - Sortir");
//        String choix = scanner.nextLine();
//        while (!choix.equals("99")) {
//            if (choix.equals("1")) {
//                for (Appartement appartement : appartementsALoue) {
//                    System.out.println(appartement.toString());
//                }
//                System.out.println("Choisissez l'identifiant de l'appartement que vous souhaitez louer'");
//                String choixReservation = scanner.nextLine();
//                Appartement appartementLoué = null;
//                for (Appartement appartement : appartementsALoue) {
//                    appartementLoué = appartement.getById(Integer.parseInt(choixReservation), appartementsALoue);
//                }
//                if (appartementLoué == null) {
//                    System.out.println("L'appartement n'existe pas");
//                }
//                System.out.println("Veuillez choisir le nombre de personne qui vont loger dans l'appartement");
//                String choixNbrPersonne = scanner.nextLine();
//                if (Integer.parseInt(choixNbrPersonne) > appartementLoué.getNombreMaxPersonne()) {
//                    System.out.println("Le nombre de personne maximum pour ce bien est de " + appartementLoué.getNombreMaxPersonne());
//                } else {
//                    appartementsLoue.add(appartementLoué);
//                    appartementsALoue.remove(appartementLoué);
//                    System.out.println("Appartement réservé");
//                }
//            } else if (choix.equals("2")) {
//                for (Appartement appartement : appartementsLoue) {
//                    System.out.println(appartement.toString() + "\n");
//                }
//                System.out.println("Choisissez l'identifiant de l'appartement que vous souhaitez remettre à louer'");
//                String choixLiberation = scanner.nextLine();
//                Appartement appartementALiberer = null;
//                for (Appartement appartement : appartementsLoue) {
//                    appartementALiberer = appartement.getById(Integer.parseInt(choixLiberation), appartementsLoue);
//                }
//                appartementsLoue.remove(appartementALiberer);
//                appartementsALoue.add(appartementALiberer);
//                System.out.println("L'appartement a bien été remis en location");
//            } else if (choix.equals("3")) {
//                System.out.println("Voici les appartements disponnible à la location");
//                for (Appartement appartement : appartementsALoue) {
//                    System.out.println(appartement.toString() + "\n");
//                }
//            } else if (choix.equals("4")) {
//                System.out.println("Voici les appartements déjà loué");
//                for (Appartement appartement : appartementsLoue) {
//                    System.out.println(appartement.toString() + "\n");
//                }
//            } else if (choix.equals("99")) {
//                System.out.println("Aurevoir");
//            } else {
//                System.out.println("L'entrée n'est pas correcte");
//            }
//        }
    }
}
