package testexeption;

import listes.Ville;

import javax.management.ReflectionException;

public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException, ReflectionException {
        Ville ville = new Ville("Dax", 10000);
        try {
            ReflectionUtils.afficherAttributs(null);
        } catch (Exception e) {
            throw new ReflectionException(e ,e.getMessage());
        }

    }
}
