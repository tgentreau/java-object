package tp_salaire;

public class Contact {
    String numTelephone;
    String mail;

    public Contact(String numTelephone, String mail) {
        this.numTelephone = numTelephone;
        this.mail = mail;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "numTelephone='" + numTelephone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
