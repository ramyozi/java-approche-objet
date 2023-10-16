package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AfficherTop10VillesDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département : ");
        String codeDepartement = scanner.next();

        List<Ville> citiesInDepartment = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                citiesInDepartment.add(ville);
            }
        }
        
        Collections.sort(citiesInDepartment, (city1, city2) -> Integer.compare(city2.getPopulationTotale(), city1.getPopulationTotale()));
        
        System.out.println("Les 10 villes les plus peuplées du département " + codeDepartement + ":");
        for (int i = 0; i < 10 && i < citiesInDepartment.size(); i++) {
            Ville city = citiesInDepartment.get(i);
            System.out.println(city.getNomCommune() + " - Population : " + city.getPopulationTotale());
        }
    }
}
