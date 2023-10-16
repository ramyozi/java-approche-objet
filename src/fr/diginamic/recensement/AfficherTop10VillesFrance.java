package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AfficherTop10VillesFrance extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        List<Ville> allCities = new ArrayList<>(recensement.getVilles());
        Collections.sort(allCities, (city1, city2) -> Integer.compare(city2.getPopulationTotale(), city1.getPopulationTotale()));
        
        System.out.println("Les 10 villes les plus peuplées de France :");
        for (int i = 0; i < 10 && i < allCities.size(); i++) {
            Ville city = allCities.get(i);
            System.out.println(city.getNomCommune() + " - Population : " + city.getPopulationTotale());
        }
    }
}
