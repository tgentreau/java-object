public class De {
    private int max;
    public De(int max){
        this.max = max;
    }
    public int getResultat(){
        return 1 + (int)(Math.random()*max);
    }

}
