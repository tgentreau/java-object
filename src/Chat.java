public class Chat extends Mammifere implements Chasseur {
    void seNourrir() {
        System.out.println("Le chat mange");
    }


    @Override
    public void chasser() {
        System.out.println("chasseur diurne");
    }
}
