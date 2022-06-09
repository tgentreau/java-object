package tri;

import java.util.*;

public class Ville  {
    public static void main(String[] args) {
        List<listes.Ville> map = new ArrayList<listes.Ville>();
        map.add(new listes.Ville("Dax", 10000));
        map.add(new listes.Ville("Bordeaux", 100000));
        map.add(new listes.Ville("Toulouse", 90000));
        Collections.sort(map);
        System.out.println(map);
    }

}
