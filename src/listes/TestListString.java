package listes;

import java.util.*;
import java.util.stream.Stream;

public class TestListString {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>();
        liste.add("Nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Pau");
        liste.add("Marseilles");
        liste.add("Tarbes");
        int largestString = liste.get(0).length();
        int index = 0;
        for (int i = 0; i < liste.size(); i++) {
            String newValue = liste.get(i).toUpperCase(Locale.ROOT);
            liste.set(i, newValue);
            if(liste.get(i).length() > largestString) {
                index = i;
            }
        }
        Iterator<String> iterator = liste.iterator();
        while (iterator.hasNext()) {
            String test = iterator.next();
            if(test.charAt(0) == 'N') {
                iterator.remove();
            }
        }
        System.out.println(liste);
    }
}
