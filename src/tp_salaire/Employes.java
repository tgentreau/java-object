package tp_salaire;

public abstract class Employes extends Personne {
    protected String matricule;

    public Employes(String nom, String prenom, String nbrSecuSociale, Adresse adresse, String matricule, Contact contact, ContactProfessionnel contactProfessionnel) {
        super(nom, prenom, nbrSecuSociale, adresse, contact, contactProfessionnel);
        setMatricule(matricule);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbrSecuSociale='" + nbrSecuSociale + '\'' +
                ", adresse=" + adresse.toString() +
                ", contact=" + contact.toString() +
                ", contactProfessionnel=" + contactProfessionnel.toString() +
                '}';
    }
}
