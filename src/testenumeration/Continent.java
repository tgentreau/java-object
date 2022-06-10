package testenumeration;

public enum Continent {
    EUROPE("Europe"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    OCEANIE("OCEANIE");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
