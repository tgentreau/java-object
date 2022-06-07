package tp_salaire;

public abstract class Personne extends Adresse{
    protected String nom;
    protected String prenom;
    protected String nbrSecuSociale;
    protected Adresse adresse;

    public Personne(int numRue, String rue, int cp, String ville, String nom, String prenom, String nbrSecuSociale, Adresse adresse) {
        super(numRue, rue, cp, ville);
        setNom(nom);
        setPrenom(prenom);
        setNbrSecuSociale(nbrSecuSociale);
        setAdresse(adresse);
    }

    public abstract String getNom();

    public abstract void setNom(String nom);

    public abstract String getPrenom();

    public abstract void setPrenom(String prenom);

    public abstract String getNbrSecuSociale();

    public abstract void setNbrSecuSociale(String nbrSecuSociale);

    public abstract Adresse getAdresse();

    public abstract void setAdresse(Adresse adresse);
}
