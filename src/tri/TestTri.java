package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTri {

    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Montpellier", 5_000_000L));
        villes.add(new Ville("Nantes", 2_000_000L));
        villes.add(new Ville("Lyon", 4_000_000L));
        villes.add(new Ville("Marseille", 8_000_000L));
        villes.add(new Ville("Paris", 10_000_000L));

        System.out.println("*** Villes originales ***");
        afficherVilles(villes);

        System.out.println("/// Tri par nom ///");
        Collections.sort(villes, new ComparatorNom());
        afficherVilles(villes);

        System.out.println("--- Tri par population ---");
        Collections.sort(villes, new ComparatorHabitant());
        afficherVilles(villes);
    }

    static void afficherVilles(List<Ville> villes) {
    	System.out.println("Noms des villes :");
        for (Ville ville : villes) {
            System.out.println(ville.getNom());
        }
    }
}
