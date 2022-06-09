package maps;

import listes.Ville;

import java.util.HashMap;

public class MapVilles {


    public static void main(String[] args) {
        HashMap<String, Ville> map = new HashMap<>();
        map.put("Dax", new Ville("Dax", 10000));
        map.put("Bordeaux", new Ville("Bordeaux", 100000));
        map.put("Toulouse", new Ville("Toulouse", 90000));

        Ville test = null;
            for (String s : map.keySet()) {
                Ville value = map.get(s);
                if(test == null || map.get(test).nbrHabitant > value.nbrHabitant) {
                    test = value;
                    map.remove(test, map.get(s));
                }
            }

        System.out.println(test);
        System.out.println(map);
    }

}
