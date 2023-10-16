package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<Ville> villes;
    
    public Recensement() {
        this.villes = new ArrayList<>();
    }
    
    public void ajouterVille(Ville ville) {
        villes.add(ville);
    }
    
    public List<Ville> getVilles() {
        return villes;
    }
    
    public void chargerDonnees(String nomFichier) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String line;
            boolean headerSkipped = false;
    
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue; // Skip the first line (header)
                }
    
                String[] parts = line.split(";");
                if (parts.length >= 8) {
                    String codeRegion = parts[0];
                    String nomRegion = parts[1];
                    String codeDepartement = parts[2];
                    String codeCommune = parts[5];
                    String nomCommune = parts[6];
                    int population = Integer.parseInt(parts[7].replaceAll(" ", "").trim());
    
                    Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
                    ajouterVille(ville);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getAllRegions() {
        List<String> regions = new ArrayList<>();
        for (Ville ville : villes) {
            if (!regions.contains(ville.getNomRegion())) {
                regions.add(ville.getNomRegion());
            }
        }
        return regions;
    }

    public int getPopulationRegion(String region) {
        int population = 0;
        for (Ville ville : villes) {
            if (ville.getNomRegion().equals(region)) {
                population += ville.getPopulationTotale();
            }
        }
        return population;
    }

    public List<String> getAllDepartements() {
        List<String> departements = new ArrayList<>();
        for (Ville ville : villes) {
            if (!departements.contains(ville.getCodeDepartement())) {
                departements.add(ville.getCodeDepartement());
            }
        }
        return departements;
    }

    public int getPopulationDepartement(String departement) {
        int population = 0;
        for (Ville ville : villes) {
            if (ville.getCodeDepartement().equals(departement)) {
                population += ville.getPopulationTotale();
            }
        }
        return population;
    }
}
