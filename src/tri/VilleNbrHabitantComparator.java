package tri;

import listes.Ville;

import java.util.Comparator;

public class VilleNbrHabitantComparator implements Comparable<Ville>, Comparator<Ville> {
    private int nbHabitants;


    @Override
    public int compareTo(listes.Ville o) {
        if (this.nbHabitants > o.nbrHabitant){
            return 1;
        }
        if (this.nbHabitants < o.nbrHabitant){
            return -1;
        }
        return 0;
    }

    public int compare(Ville o1, Ville o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
