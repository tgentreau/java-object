package tp_appart.entities;

public class Peniche extends Logement{
    protected int longueur;
    public Peniche(int id, int prixLocationParNuit, Adresse adresse, int nombreMaxPersonne, boolean reserve, int longueur) {
        super(id, prixLocationParNuit, adresse, nombreMaxPersonne, reserve);
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Peniche{" +
                "id=" + id +
                ", prixLocationParNuit=" + prixLocationParNuit +
                ", adresse=" + adresse +
                ", nombreMaxPersonne=" + nombreMaxPersonne +
                ", reserve=" + reserve +
                ", longueur=" + longueur +
                '}';
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
