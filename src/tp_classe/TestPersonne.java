package tp_classe;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("tutu", "toto", new AdressePostale(5, "rue de ka", 40000, "ville"));
        Personne p2 = new Personne("Jean", "lolo");
        System.out.println(p2.printName());
        p2.setNom("Toto");
        System.out.println(p2.getNom());
        //p2.setFirstname("Lolo");
        System.out.println(p2.getPrenom());
    }
}
