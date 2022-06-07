package banque.entities;

public class Compte {
    protected int numCompte;
    protected int soldeCompte;

    public Compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public int getSoldeCompte() {
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
