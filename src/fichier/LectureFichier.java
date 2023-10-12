package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Users/ramzi/Downloads/recensement.csv");
        List<String> liste = Files.readAllLines(path, StandardCharsets.UTF_8);

        ArrayList<Ville> villes = new ArrayList<>();

        for (String line : liste) {
            String[] tokens = line.split(";");
            
            // extraction des donnees
            if (tokens.length == 4) {
                String nom = tokens[0];
                String codeDepartement = tokens[1];
                String nomRegion = tokens[2];
                int populationTotale = Integer.parseInt(tokens[3]);
                // nouvel objet: ville
                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                villes.add(ville);
            }
        }

        for (Ville line : villes) {
            System.out.println(line);
        }

		
	}

}

		