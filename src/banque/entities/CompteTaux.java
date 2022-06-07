package banque.entities;

public class CompteTaux extends Compte{
    protected double tauxRemun;
    public CompteTaux(String numCompte, double soldeCompte, double tauxRemun) {
        super(numCompte, soldeCompte);
        this.tauxRemun = tauxRemun;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tauxRemun=" + tauxRemun +
                '}';
    }
}
