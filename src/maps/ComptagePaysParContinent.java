package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// création arrayList
		
		ArrayList<Pays> paysListe = new ArrayList<>();
		paysListe.add(new Pays("France", 65000000L, "Europe"));
		paysListe.add(new Pays("Allemagne", 80000000L, "Europe"));
		paysListe.add(new Pays("Belgique", 10000000L, "Europe"));
		paysListe.add(new Pays("Russie", 150000000L, "Asie"));
		paysListe.add(new Pays("Chine", 1400000000L, "Asie"));
		paysListe.add(new Pays("Indonésie", 220000000, "Océanie"));
		paysListe.add(new Pays("Australie", 65000000, "Océanie"));
		
		HashMap<String, Long> cpt = new HashMap<String, Long>();		
		
		// Comptage
        Map<String, Long> comptageParContinent = paysListe.stream()
                .collect(Collectors.groupingBy(Pays::getContinent, Collectors.counting()));

		// Affichage
        comptageParContinent.forEach((continent, count) ->
        System.out.println("Continent : " + continent + ", Nombre de pays : " + count));

	}

}
