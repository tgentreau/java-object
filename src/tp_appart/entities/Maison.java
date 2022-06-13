package tp_appart.entities;

public class Maison extends Logement{
    protected boolean jardin;
    public Maison(int id, int prixLocationParNuit, Adresse adresse, int nombreMaxPersonne, boolean reserve, boolean jardin) {
        super(id, prixLocationParNuit, adresse, nombreMaxPersonne, reserve);
        this.jardin = jardin;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "id=" + id +
                ", prixLocationParNuit=" + prixLocationParNuit +
                ", adresse=" + adresse +
                ", nombreMaxPersonne=" + nombreMaxPersonne +
                ", reserve=" + reserve +
                ", jardin=" + jardin +
                '}';
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }
}
