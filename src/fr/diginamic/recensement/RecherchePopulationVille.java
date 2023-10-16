package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la ville : ");
        String nomVille = scanner.next();

        int population = 0;
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                population = ville.getPopulationTotale();
                break;
            }
        }
        System.out.println("Population de la ville " + nomVille + " : " + population);
    }
}
