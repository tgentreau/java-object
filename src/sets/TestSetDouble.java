package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);
        System.out.println(set);
        System.out.println(Collections.max(set));

        Double nbr = null;
        for (Double aDouble : set) {
            if(nbr == null) {
                nbr = aDouble;
            } else {
                if(nbr > aDouble) {
                    nbr = aDouble;
                }
            }
        }
        set.remove(nbr);
        System.out.println(set);
    }
}
