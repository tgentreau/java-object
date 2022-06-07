package tp_interface;

import java.util.ArrayList;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(5,3);
        ObjetGeometrique arr[]= new ObjetGeometrique[2];
        arr[0] = cercle;
        arr[1] = rectangle;
        for (ObjetGeometrique objetGeometrique : arr) {
            System.out.println(objetGeometrique.perimetre());
            System.out.println(objetGeometrique.surface());
        }
    }
}
