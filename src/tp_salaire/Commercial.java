package tp_salaire;

public class Commercial extends Employes implements Calculable{
    public final double POURCENTAGECA = 5;
    public final double charges = 24;
    public double chiffreAffaire;
    public Commercial(String nom, String prenom, String nbrSecuSociale, Adresse adresse, String matricule, Contact contact, ContactProfessionnel contactProfessionnel, double chiffreAffaire) {
        super(nom, prenom, nbrSecuSociale, adresse, matricule, contact, contactProfessionnel);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double salaireBrut() {
        double salaire = chiffreAffaire * (POURCENTAGECA / chiffreAffaire) * 100;
        return salaire;
    }

    @Override
    public double salaireNet() {
        double salaireBrut = salaireBrut();
        double salaireNet = (salaireBrut / charges) * 100;
        return salaireNet;
    }

    @Override
    public String toString() {

        return super.toString() + "Commercial{" +
                "Pourcentage CA=" + POURCENTAGECA +
                ", chiffre d'affaire=" + chiffreAffaire +
                ", salaireBrut=" + salaireBrut() +
                ", salaireNet=" + salaireNet() +
                '}';
    }

}
