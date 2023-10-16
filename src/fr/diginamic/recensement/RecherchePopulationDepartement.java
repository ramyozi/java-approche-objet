package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département : ");
        String codeDepartement = scanner.next();

        
        int totalPopulation = 0;
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                totalPopulation += ville.getPopulationTotale();
            }
        }
        System.out.println("Population du département " + codeDepartement + " : " + totalPopulation);
    }
}
