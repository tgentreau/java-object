package banque;

import banque.entities.Banque;

public class TestBanque {
    public static void main(String[] args) {
        Banque banque = new Banque(500000000, 500);
        System.out.println(banque);
    }
}
