package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// 1. 
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");
        
        // 2. une boucle pour afficher l'ensemble des clés contenues dans la map
        System.out.println("Clés dans la map :");
        for (Integer key : mapVilles.keySet()) {
            System.out.println(key);
        }

        // 3. une boucle pour afficher l'ensemble des valeurs contenues dans la map
        System.out.println("\nValeurs dans la map :");
        for (String value : mapVilles.values()) {
            System.out.println(value);
        }

        // 4. Afficher la taille de la map
        System.out.println("\nTaille de la map : " + mapVilles.size());
        

	}

}
