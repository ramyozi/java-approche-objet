package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AfficherTop10Departements extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Get the list of all departments from 'recensement'
        List<String> departements = recensement.getAllDepartements();
        
        // Sort the departments by total population (you need to implement 'getAllDepartements' method)
        Collections.sort(departements, (dep1, dep2) -> {
            int population1 = recensement.getPopulationDepartement(dep1);
            int population2 = recensement.getPopulationDepartement(dep2);
            return Integer.compare(population2, population1);
        });
        
        // Display the top 10 departments
        System.out.println("Les 10 départements les plus peuplés :");
        for (int i = 0; i < 10 && i < departements.size(); i++) {
            System.out.println(departements.get(i));
        }
    }
}
