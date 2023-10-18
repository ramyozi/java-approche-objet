package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import listes.Ville;

public class TestEnumeration {
	public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();

        villes.add(new Ville("New York", 8537673, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 2243833, Continent.EUROPE));
        villes.add(new Ville("Pékin", 21706933, Continent.ASIE));
        villes.add(new Ville("Moscou", 12615279, Continent.EUROPE));
        villes.add(new Ville("Berlin", 3644826, Continent.EUROPE));
        villes.add(new Ville("Sydney", 4741874, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 12252023, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 1146056, Continent.AFRIQUE));

        System.out.println("--------------------------------------------------");
        System.out.println("| Ville        | Population  | Continent    |");
        System.out.println("--------------------------------------------------");
        for (Ville ville : villes) {
            System.out.printf("| %-13s | %-11d | %-12s |\n", ville.getNom(), ville.getNbHabitant(), ville.getContinent().getLibelle());
        }
        System.out.println("--------------------------------------------------");
    }
}






