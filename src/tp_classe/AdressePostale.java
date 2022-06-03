package tp_classe;

public class AdressePostale {
    protected int nbrRue;
    protected String libelleRue;
    protected int cp;
    protected String ville;

    public AdressePostale(int nbrRue, String libelleRue, int cp, String ville) {
        this.nbrRue = nbrRue;
        this.libelleRue = libelleRue;
        this.cp = cp;
        this.ville = ville;
    }
}
