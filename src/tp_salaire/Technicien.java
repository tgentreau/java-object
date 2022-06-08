package tp_salaire;

public class Technicien extends Employes  implements Calculable{
    public final double heureParAns = 1607;
    public final double charges = 24;
    public double tauxJournalier;
    public Technicien(String nom, String prenom, String nbrSecuSociale, Adresse adresse, String matricule, Contact contact, ContactProfessionnel contactProfessionnel, double tauxJournalier) {
        super(nom, prenom, nbrSecuSociale, adresse, matricule, contact, contactProfessionnel);
        this.tauxJournalier = tauxJournalier;
    }

    @Override
    public double salaireBrut() {
        double salaire = heureParAns * tauxJournalier;
        return salaire;
    }

    @Override
    public double salaireNet() {
        double salaireBrut = salaireBrut();
        double salaireNet = (salaireBrut * charges) / 100;
        double salaireNetMensuel = salaireNet / 12;
        return salaireNetMensuel;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Technicien{" +
                "heureParAns=" + heureParAns +
                ", tauxJournalier=" + tauxJournalier +
                ", salaireBrut=" + salaireBrut() +
                ", salaireNetMensuel=" + salaireNet() +
                '}';
    }

    public void fabriquerEtControlerLesProduits() {}
}
