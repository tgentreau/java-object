package tp_interface;

public class Cercle implements ObjetGeometrique{
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        double p = 2 * Math.PI * this.rayon;
        return p;
    }

    @Override
    public double surface() {
        double s = (this.rayon * this.rayon) * Math.PI;
        return s;
    }
}
