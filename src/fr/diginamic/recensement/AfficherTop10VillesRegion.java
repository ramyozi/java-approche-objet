package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AfficherTop10VillesRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        String nomRegion = scanner.next();

        List<Ville> citiesInRegion = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                citiesInRegion.add(ville);
            }
        }
        
        Collections.sort(citiesInRegion, (city1, city2) -> Integer.compare(city2.getPopulationTotale(), city1.getPopulationTotale()));
        
        System.out.println("Les 10 villes les plus peuplées de la région " + nomRegion + ":");
        for (int i = 0; i < 10 && i < citiesInRegion.size(); i++) {
            Ville city = citiesInRegion.get(i);
            System.out.println(city.getNomCommune() + " - Population : " + city.getPopulationTotale());
        }
    }
}
