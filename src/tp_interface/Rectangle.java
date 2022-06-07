package tp_interface;

public class Rectangle implements ObjetGeometrique{
    public int longueur;
    public int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        double p = (this.longueur + this.largeur) * 2;
        return p;
    }

    @Override
    public double surface() {
        double s = this.longueur * this.largeur;
        return s;
    }
}
