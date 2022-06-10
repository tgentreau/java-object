package testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison saison = Saison.ETE;
        String nom = "ETE";
        String libelle = "Hiver";
        for (Saison value : Saison.values()) {
            System.out.println(value.getLibelle());
        }


    }
}
