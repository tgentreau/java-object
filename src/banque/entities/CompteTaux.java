package banque.entities;

public class CompteTaux extends Compte{
    protected int tauxRemun = 2;
    public CompteTaux(int numCompte, int soldeCompte, int tauxRemun) {
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
