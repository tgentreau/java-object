package tp_salaire;

public class Employes extends Personne {
    protected String matricule;

    public Employes(int numRue, String rue, int cp, String ville, String nom, String prenom, String nbrSecuSociale, Adresse adresse, String matricule) {
        super(numRue, rue, cp, ville, nom, prenom, nbrSecuSociale, adresse);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String getNom() {
        return null;
    }

    @Override
    public void setNom(String nom) {

    }

    @Override
    public String getPrenom() {
        return null;
    }

    @Override
    public void setPrenom(String prenom) {

    }

    @Override
    public String getNbrSecuSociale() {
        return null;
    }

    @Override
    public void setNbrSecuSociale(String nbrSecuSociale) {

    }

    @Override
    public Adresse getAdresse() {
        return null;
    }

    @Override
    public void setAdresse(Adresse adresse) {

    }
}
