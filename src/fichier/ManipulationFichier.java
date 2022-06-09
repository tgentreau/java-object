package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("recensement.csv");
        Path pathDestination = Paths.get("recensement2.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        String[] parts = null;
        ArrayList<Ville> villes = new ArrayList<>();
        for (String line : lines) {
            if(lines.indexOf(line) != 0) {
                parts = line.split(";");
                villes.add(new Ville(parts[6], parts[0], parts[9].trim().replaceAll(" ", "")));
            }
        }
        for (Ville ville : villes) {
            if(Integer.parseInt(ville.population) >= 25000) {
                Files.write(pathDestination, Collections.singleton(ville.getNomVille() + ";" + ville.getCodeDepartement() + ";" + ville.getPopulation()), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
        }
    }
}
