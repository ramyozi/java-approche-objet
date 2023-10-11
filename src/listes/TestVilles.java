package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		List<Ville> MaListe = new ArrayList<>();

		MaListe.add(new Ville("Nice", 343000));
        MaListe.add(new Ville("Carcassonne", 47800));
        MaListe.add(new Ville("Narbonne", 53400));
        MaListe.add(new Ville("Lyon", 484000));
        MaListe.add(new Ville("Foix", 9700));
        MaListe.add(new Ville("Pau", 77200));
        MaListe.add(new Ville("Marseille", 850700));
        MaListe.add(new Ville("Tarbes", 40600));
        
        // Recherchez la ville la plus peuplée
        Ville villePlusPeuplee = rechercherVillePlusPeuplee(MaListe);
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee.getNom());

        // Recherchez la ville la moin peuplée
        Ville villeMoinsPeuplee = rechercherVilleMoinsPeuplee(MaListe);
        System.out.println("Ville la moins peuplée : " + villeMoinsPeuplee.getNom());
        MaListe.remove(villeMoinsPeuplee);
        
        //Uppercase ville avec plus de 100,000 habitants
        for (Ville ville : MaListe) {
            ville.mettreNomEnMajusculesSiPopulationSuperieureA(100000);
        }        
        
        // Afficher
        AfficherListeNomVille(MaListe);

	}
	
	public static Ville rechercherVillePlusPeuplee(List<Ville> villes) {
        Ville villePlusPeuplee = null;
        int populationMax = 0;

        for (Ville ville : villes) {
            if (ville.getNbHabitant() > populationMax) {
                populationMax = ville.getNbHabitant();
                villePlusPeuplee = ville;
            }
        }

        return villePlusPeuplee;
    }
	
	
	
	public static Ville rechercherVilleMoinsPeuplee(List<Ville> villes) {
        Ville villeMoinsPeuplee = null;
        int populationMin = Integer.MAX_VALUE;

        for (Ville ville : villes) {
            if (ville.getNbHabitant() < populationMin) {
                populationMin = ville.getNbHabitant();
                villeMoinsPeuplee = ville;
            }
        }

        return villeMoinsPeuplee;
    }
	
	public static void AfficherListeNomVille(List<Ville> villes) {
		List<String> Noms = new ArrayList<>();
		for (Ville ville : villes) {
			Noms.add(ville.getNom());
		}
		System.out.println("liste noms de ville: "+ Noms);
	}
}
