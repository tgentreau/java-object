package tp_appart.service;

import tp_appart.dao.LogementDAO;
import tp_appart.entities.Logement;
import tp_appart.exeptions.AlreadyReservedExeption;
import tp_appart.exeptions.SurCapaciteExeption;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private LogementDAO logementDAO;

    public ReservationService(LogementDAO logementDAO) {
        this.logementDAO = logementDAO;
    }
    public void reserver(Logement logement, int nombreDePersonne) throws AlreadyReservedExeption, SurCapaciteExeption {
        if (logement.isReserve()) {
            throw new AlreadyReservedExeption("L'appartement " + logement + " est déjà réservé");
        }
        if (nombreDePersonne > logement.getNombreMaxPersonne()) {
            throw new SurCapaciteExeption("L'appartement " + logement + " n'as pas assez de place");
        }

        logement.setReserve(true);
    }

    public void liberer(Logement logement) {
        logement.setReserve(false);
    }


    public List<Logement> listerLogementDisponibles() {
        List<Logement> logementDisponibles = new ArrayList<>();
        for (Logement logement : logementDAO.lister()) {
            if (!logement.isReserve()) {
                logementDisponibles.add(logement);
            }
        }
        return logementDisponibles;
    }

    public List<Logement> listerLogementNonDisponibles() {
        List<Logement> logementsNonDisponibles = new ArrayList<>();
        for (Logement logement : logementDAO.lister()) {
            if (logement.isReserve()) {
                logementsNonDisponibles.add(logement);
            }
        }
        return logementsNonDisponibles;
    }

    public void setAppartementDao(LogementDAO logementDAO) {
        this.logementDAO = logementDAO;
    }
}
