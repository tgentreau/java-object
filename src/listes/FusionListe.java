package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("rouge");
        liste1.add("vert");
        liste1.add("orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("blanc");
        liste2.add("bleu");
        liste2.add("orange");

        List<String> liste3 = new ArrayList<String>();
        Iterator<String> iterator1 = liste1.iterator();
        while (iterator1.hasNext()) {
            String el = iterator1.next();
            liste3.add(el);
        }
        Iterator<String> iterator2 = liste2.iterator();
        while (iterator2.hasNext()) {
            String el = iterator2.next();
            liste3.add(el);
        }
        System.out.println(liste3);
    }
}
