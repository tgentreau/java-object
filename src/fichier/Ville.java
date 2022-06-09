package fichier;

public class Ville {
    public String nomVille;
    public String codeDepartement;
    public String population;

    public Ville(String nomVille, String codeDepartement, String population) {
        this.nomVille = nomVille;
        this.codeDepartement = codeDepartement;
        this.population = population;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", population='" + population + '\'' +
                '}';
    }
}
