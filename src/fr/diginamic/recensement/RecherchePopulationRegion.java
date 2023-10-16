package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        String nomRegion = scanner.next();
        
        int totalPopulation = 0;
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                totalPopulation += ville.getPopulationTotale();
            }
        }
        System.out.println("Population de la région " + nomRegion + " : " + totalPopulation);
    }
}
