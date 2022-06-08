package maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();

        for (Integer integer : map1.keySet()) {
            for (String value : map1.values()) {
                map3.put(integer, value);
            }
        }

        for (Integer integer : map2.keySet()) {
            for (String value : map2.values()) {
                map3.put(integer, value);
            }
        }
        System.out.println(map3);
    }
}
