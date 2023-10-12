package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:/Users/ramzi/Downloads/recensement.csv");
        List<String> tableau;

        try {
            tableau = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

            List<String> filtre = new ArrayList<>();
            boolean firstLine = true;

            for (String line : tableau) {
                if (firstLine) {
                    firstLine = false;
                    continue; 
                }

                String[] tokens = line.split(";");
                
                if (tokens.length == 10) {
                    String nom = tokens[6];
                    String codeDep = tokens[2];
                    String nomRegion = tokens[1];
                    try {
                        int populationTotale = Integer.parseInt(tokens[9].replaceAll("\\s", ""));
                        if (populationTotale > 25000) {
                            filtre.add(nom + ";" + codeDep + ";" + nomRegion + ";" + populationTotale);
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }

            Path outputPath = Paths.get("C:/Users/ramzi/Downloads/filtered_cities.csv");

            StringBuilder csvContent = new StringBuilder();
            csvContent.append("Nom;Code département;Nom de la région;Population totale\n");
            for (String city : filtre) {
                csvContent.append(city).append("\n");
            }

            Files.write(outputPath, csvContent.toString().getBytes(StandardCharsets.UTF_8));

            System.out.println("Filtered cities with a population over 25,000 have been written to filtered_cities.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
