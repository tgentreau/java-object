package listes;

import java.util.*;

public class Ville {
    public String nom;
    public int nbrHabitant;

    public Ville(String nom, int nbrHabitant) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbrHabitant=" + nbrHabitant +
                '}';
    }

    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<Ville>();
        Ville nice = new Ville("Nice", 343000);
        Ville carca = new Ville("Carcassonne", 47800);
        Ville narbonne = new Ville("Narbonne",  53400);
        Ville lyon = new Ville("Lyon", 484000);
        Ville foix = new Ville("Foix", 9700);
        Ville pau = new Ville("Pau",  77200);
        Ville marseille = new Ville("Marseille",850700);
        Ville tarbes = new Ville("Tarbes",40600);
        villes.add(nice);
        villes.add(carca);
        villes.add(narbonne);
        villes.add(lyon);
        villes.add(foix);
        villes.add(pau);
        villes.add(marseille);
        villes.add(tarbes);

        Iterator<Ville> iterator = villes.iterator();
        Ville villePlus = null;
        Ville villeMoins = null;
        while (iterator.hasNext()) {
            Ville el = iterator.next();
            if(villePlus == null || villeMoins == null) {
                villePlus = el;
                villeMoins = el;
            } else {
                if(villePlus.nbrHabitant < el.nbrHabitant) {
                    villePlus = el;
                } else if(villeMoins.nbrHabitant > el.nbrHabitant){
                    villeMoins = el;
                }
            }
        }
        for (Ville ville : villes) {
            if(ville.nbrHabitant >= 100000) {
                ville.nom = ville.nom.toUpperCase(Locale.ROOT);
            }
        }
        villes.remove(villeMoins);
        System.out.println(villePlus.toString());
        System.out.println(villeMoins.toString());
        System.out.println(villes);
    }
}
