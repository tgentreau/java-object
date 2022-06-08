package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");

        Iterator<String> iterator = set.iterator();
        String ele = null;
        while (iterator.hasNext()) {
            String el = iterator.next();
            if(ele == null) {
                ele = el;
            } else {
                if(ele.length() > el.length()) {
                    ele = el;
                }
            }
        }
        System.out.println(ele);
    }
}
