package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AfficherTop10Regions extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        List<String> regions = recensement.getAllRegions();
        

        Collections.sort(regions, (region1, region2) -> {
            int population1 = recensement.getPopulationRegion(region1);
            int population2 = recensement.getPopulationRegion(region2);
            return Integer.compare(population2, population1);
        });
        
        // Display the top 10 regions
        System.out.println("Les 10 régions les plus peuplées :");
        for (int i = 0; i < 10 && i < regions.size(); i++) {
            System.out.println(regions.get(i));
        }
    }
}
