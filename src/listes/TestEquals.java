package listes;

public class TestEquals {


    public static void main(String[] args) {
        Ville ville1 = new Ville("Dax", 150000);
        Ville ville2 = new Ville("Dax", 150000);
        Ville ville3 = new Ville("Bordeaux", 150000);
        boolean test = ville1.equals(ville2);
        boolean test2 = ville1.equals(ville3);
        System.out.println(test);
        System.out.println(test2);
        boolean test3 = ville1 == ville2;
        boolean test4 = ville1 == ville1;
        System.out.println(test3);
        System.out.println(test4);
    }
}
