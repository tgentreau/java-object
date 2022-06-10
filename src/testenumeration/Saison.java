package testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("ETE", 2),
    AUTOMNE("AUTOMNE", 3),
    HIVER("HIVER", 4);

    private String libelle;
    private int numOrdre;

    private Saison(String libelle, int numOrdre) {
        this.libelle = libelle;
        this.numOrdre = numOrdre;
    }

    public String getLibelle() {
       return this.libelle = libelle;
    }

}
