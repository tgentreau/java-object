package tp_classe;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this(nom, prenom);
        this.adressePostale = adressePostale;
    }

    public String printName() {
        return prenom + " " + nom.toUpperCase();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdressePostale(AdressePostale newAdresse) {
        this.adressePostale = newAdresse;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdressePostale() {
        return this.adressePostale;
    }
}
