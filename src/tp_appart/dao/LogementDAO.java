package tp_appart.dao;

import tp_appart.entities.Logement;

import java.util.ArrayList;
import java.util.List;

public class LogementDAO {
    private List<Logement> logements = new ArrayList<>();

    public void ajouter(Logement logement) {
        logements.add(logement);
    }

    public void supprimer(Logement logement) {
        logements.remove(logement);
    }

    public List<Logement> lister() {
        return logements;
    }
}
