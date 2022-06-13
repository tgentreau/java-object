public class TestDe {
    public static void main(String[] args) {
        De de = new De(6);
        int compt = 0;
        int nbrCoup = 0;
//        do {
//            System.out.printf("res: " + de.getResultat() + " ");
//            if(de.getResultat() == 6) {
//                compt++;
//            }
//            nbrCoup++;
//        } while (compt <= 10);

        while (compt < 10) {
            System.out.printf("res: " + de.getResultat() + " ");
            if(de.getResultat() == 6) {
                compt++;
            }
            nbrCoup++;
        }
        System.out.println(nbrCoup);
    }
}
