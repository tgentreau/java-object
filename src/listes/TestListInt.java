package listes;

import java.util.*;

public class TestListInt {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);
        System.out.println(liste);
        System.out.println("taille: " + liste.size());
        System.out.println("plus grand: " + Collections.max(liste));
        liste.remove(Collections.min(liste));
        System.out.println(liste);

        List<Integer> liste2 = new ArrayList<Integer>();
        Iterator<Integer> iterator = liste.iterator();
        while (iterator.hasNext()) {
            int test = iterator.next();
            if(test < 0) {
                iterator.remove();
                test = Math.abs(test);
                liste2.add(test);
            }
        }
        liste2.addAll(liste);
        System.out.println(liste2);
    }
}
