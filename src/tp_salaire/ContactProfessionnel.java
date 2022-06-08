package tp_salaire;

public class ContactProfessionnel extends Contact{
    String service;
    Adresse adresseEntreprise;
    public ContactProfessionnel(String numTelephone, String mail, String service, Adresse adresseEntreprise) {
        super(numTelephone, mail);
        this.service = service;
        this.adresseEntreprise = adresseEntreprise;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Adresse getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(Adresse adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    @Override
    public String toString() {
        return "ContactProfessionnel{" +
                "numTelephone='" + numTelephone + '\'' +
                ", mail='" + mail + '\'' +
                ", service='" + service + '\'' +
                ", adresseEntreprise='" + adresseEntreprise.toString() + '\'' +
                '}';
    }
}
