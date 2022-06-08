package tp_salaire;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String nbrSecuSociale;
    protected Adresse adresse;
    protected Contact contact;
    protected ContactProfessionnel contactProfessionnel;

    public Personne(String nom, String prenom, String nbrSecuSociale, Adresse adresse, Contact contact, ContactProfessionnel contactProfessionnel) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbrSecuSociale = nbrSecuSociale;
        this.adresse = adresse;
        this.contact = contact;
        this.contactProfessionnel = contactProfessionnel;
    }
//
//    public abstract String getNom();
//
//    public abstract void setNom(String nom);
//
//    public abstract String getPrenom();
//
//    public abstract void setPrenom(String prenom);
//
//    public abstract String getNbrSecuSociale();
//
//    public abstract void setNbrSecuSociale(String nbrSecuSociale);
//
//    public abstract Adresse getAdresse();
//
//    public abstract void setAdresse(Adresse adresse);
//
//    public abstract Contact getContact();
//
//    public abstract void setContact(Contact contact);
//
//    public abstract ContactProfessionnel getContactProfessionnel();
//
//    public abstract void setContactProfessionnel(ContactProfessionnel contactProfessionnel);
//
//    public abstract String toString();
}
