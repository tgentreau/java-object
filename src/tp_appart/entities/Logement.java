package tp_appart.entities;

public abstract class Logement {
    public int id;
    public int prixLocationParNuit;
    public Adresse adresse;
    public int nombreMaxPersonne;
    public boolean reserve;

    public Logement(int id, int prixLocationParNuit, Adresse adresse, int nombreMaxPersonne, boolean reserve) {
        this.id = id;
        this.prixLocationParNuit = prixLocationParNuit;
        this.adresse = adresse;
        this.nombreMaxPersonne = nombreMaxPersonne;
        this.reserve = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrixLocationParNuit() {
        return prixLocationParNuit;
    }

    public void setPrixLocationParNuit(int prixLocationParNuit) {
        this.prixLocationParNuit = prixLocationParNuit;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getNombreMaxPersonne() {
        return nombreMaxPersonne;
    }

    public void setNombreMaxPersonne(int nombreMaxPersonne) {
        this.nombreMaxPersonne = nombreMaxPersonne;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }
}
