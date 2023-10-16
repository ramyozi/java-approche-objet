package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AfficherTop10Departements extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Afficher les 10 départements les plus peuplés :");

        List<String> departements = recensement.getAllDepartements();
        
        if (departements.size() > 0) {
            Collections.sort(departements, (dept1, dept2) -> {
                int population1 = recensement.getPopulationDepartement(dept1);
                int population2 = recensement.getPopulationDepartement(dept2);
                return Integer.compare(population2, population1);
            });

            int count = 0;
            for (String departement : departements) {
                if (count >= 10) {
                    break;
                }
                int population = recensement.getPopulationDepartement(departement);
                System.out.printf("%-5s%-35s%-20s%-10s%n", (count + 1) + ".", departement, "Population : " + population + " habitants", "(" + population + ")");
                count++;
            }
        } else {
            System.out.println("Aucun département avec population connue.");
        }
    }
}
