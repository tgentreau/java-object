package tp_salaire;

public class Adresse {
    public int numRue;
    public String rue;
    public int cp;
    public String ville;

    public Adresse(int numRue, String rue, int cp, String ville) {
        setNumRue(numRue);
        setRue(rue);
        setCp(cp);
        setVille(ville);
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
