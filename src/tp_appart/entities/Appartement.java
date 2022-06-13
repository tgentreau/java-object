package tp_appart.entities;

public class Appartement extends Logement{
    private int etage;

    public Appartement(int id, int prixLocationParNuit, Adresse adresse, int nombreMaxPersonne, int etage, boolean reserve) {
        super(id, prixLocationParNuit, adresse, nombreMaxPersonne, reserve);
        this.etage = etage;
    }


    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "id=" + id +
                ", prixLocationParNuit=" + prixLocationParNuit +
                ", adresse=" + adresse +
                ", nombreMaxPersonne=" + nombreMaxPersonne +
                ", reserve=" + reserve +
                "etage=" + etage +
                '}';
    }
}
