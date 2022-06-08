package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.size());
    }
}
