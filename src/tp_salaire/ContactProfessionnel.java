package tp_salaire;

public class ContactProfessionnel extends Contact{
    String service;
    String adresseEntreprise;
    public ContactProfessionnel(String numTelephone, String mail, String service, String adresseEntreprise) {
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

    public String getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(String adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }
}
