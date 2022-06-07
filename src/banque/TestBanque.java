package banque;

import banque.entities.Compte;
import banque.entities.CompteTaux;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(500000000, 500);
        System.out.println(compte);
        CompteTaux compteTaux = new CompteTaux(50000, 100, 2);
        System.out.println(compteTaux);
        ArrayList<Compte> arr = new ArrayList<>();
        arr.add(compte);
        arr.add(compteTaux);
        System.out.println(arr);
    }
}
