package sets;

import testenumeration.Continent;

import java.util.HashSet;
import java.util.Locale;

public class Pays {
    public String nom;
    public double nbrHabitant;
    public double pibParHabitant;
    public Continent continent;

    public Pays(String nom, double nbrHabitant, double pibParHabitant, Continent continent) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
        this.pibParHabitant = pibParHabitant;
        this.continent = continent;
    }

    double calculerPIBTotal() {
        return nbrHabitant * pibParHabitant;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbrHabitant=" + nbrHabitant +
                ", pibParHabitant=" + pibParHabitant +
                ", continent=" + continent +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        Pays usa = new Pays("USA", 329500000, 63543.58, Continent.AMERIQUE);
        Pays france = new Pays("France", 67390000, 38625.07, Continent.EUROPE);
        Pays allemagne = new Pays("Allemagne", 83240000, 45723.64, Continent.EUROPE);
        Pays uk = new Pays("Uk", 67220000, 40284.64, Continent.EUROPE);
        Pays italie = new Pays("Italie", 59550000, 31676.20, Continent.EUROPE);
        Pays japon = new Pays("Japon", 125800000, 40113.06, Continent.ASIE);
        Pays chine = new Pays("Chine", 1402000000, 10500.40, Continent.ASIE);
        Pays russie = new Pays("Russie", 144100000, 10126.72, Continent.EUROPE);
        Pays inde = new Pays("Inde", 1380000000, 1900.71, Continent.ASIE);
        pays.add(usa);
        pays.add(france);
        pays.add(allemagne);
        pays.add(uk);
        pays.add(italie);
        pays.add(japon);
        pays.add(chine);
        pays.add(russie);
        pays.add(inde);

        Pays paysAvecPibTotalMax = null;
        Pays paysAvecPibTotalMin = null;
        Pays paysAvecPibMax = null;
        for (Pays pay : pays) {
            if(paysAvecPibTotalMax == null || (pay.calculerPIBTotal() > paysAvecPibTotalMax.calculerPIBTotal())) {
                paysAvecPibTotalMax = pay;
            }
            if(paysAvecPibMax == null) {
                paysAvecPibMax = pay;
            } else {
                if(paysAvecPibMax.pibParHabitant < pay.pibParHabitant) {
                    paysAvecPibMax = pay;
                }
            }
        }

        for (Pays pay : pays) {
            if(paysAvecPibTotalMin == null) {
                paysAvecPibTotalMin = pay;
            } else {
                if(paysAvecPibTotalMin.pibParHabitant > pay.pibParHabitant){
                    pay.nom = pay.nom.toUpperCase(Locale.ROOT);
                }
            }
        }

        int compteurEU = 0;
        int compteurAS = 0;
        int compteurAM = 0;

        for (Pays pay : pays) {
            if(pay.continent.equals(Continent.EUROPE)) {
                compteurEU++;
            } else if(pay.continent.equals(Continent.AMERIQUE)) {
                compteurAM++;
            } else if(pay.continent.equals(Continent.ASIE)) {
                compteurAS++;
            }
        }
//        pays.remove(paysAvecPibTotalMin);
        System.out.println(paysAvecPibMax.toString());
        System.out.println(paysAvecPibTotalMax.toString());
        System.out.println(paysAvecPibTotalMin.toString());
        System.out.println(pays.toString());
        System.out.println();
        StringBuilder builder = new StringBuilder();
        builder.append("Europe = ").append(compteurEU).append("\n").append("Amerique = ").append(compteurAM).append("\n").append("Asie = ").append(compteurAS);
        System.out.println(builder.toString());

    }
}
