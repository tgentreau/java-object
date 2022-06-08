package tp_salaire;

public class TestSalaire {
    public static void main(String[] args) {
        Adresse adresse = new Adresse(5, "rue de la", 40000, "Laville");
        Contact contact = new Contact("0558585858", "mail@mail.mail");
        ContactProfessionnel contactProfessionnel = new ContactProfessionnel("0559595959", "mail2@mail2.fr", "service", "La belle adresse");
        Cadre cadre = new Cadre("Toto", "Tutu", "1845618456", adresse, "fzz464694", contact, contactProfessionnel, 10);
        Technicien technicien = new Technicien("Lolo", "Lulu", "464346346", adresse, "jfiz646", contact, contactProfessionnel, 5);
        Commercial commercial = new Commercial("Soso", "Susu", "465414646", adresse, "oifjdeo475", contact, contactProfessionnel, 15);
        System.out.println(cadre.toString());
        System.out.println(technicien.toString());
        System.out.println(commercial.toString());

    }
}
