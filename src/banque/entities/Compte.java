package banque.entities;

public class Compte {
    protected String numCompte;
    protected double soldeCompte;

    public Compte(String numCompte, double soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "numCompte=" + numCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}
