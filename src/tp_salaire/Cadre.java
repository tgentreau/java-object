package tp_salaire;

public class Cadre extends Employes implements Calculable{
    public final double nbrJour = 212;
    public final double charges = 24;
    public double tauxJournalier;
    public Cadre(String nom, String prenom, String nbrSecuSociale, Adresse adresse, String matricule, Contact contact, ContactProfessionnel contactProfessionnel, double tauxJournalier) {
        super(nom, prenom, nbrSecuSociale, adresse, matricule, contact, contactProfessionnel);
        this.tauxJournalier = tauxJournalier;
    }

    @Override
    public double salaireBrut() {
        double salaire = nbrJour * tauxJournalier;
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
        return super.toString() +
                "Cadre{" +
                "nbrJour=" + nbrJour +
                ", tauxJournalier=" + tauxJournalier +
                ", salaireBrut=" + salaireBrut() +
                ", salaireNet=" + salaireNet() +
                '}';
    }
}
