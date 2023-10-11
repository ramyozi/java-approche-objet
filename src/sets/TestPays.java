package sets;

import java.util.HashSet;

public class TestPays {
	public static void main(String[] args) {
		HashSet<Pays> paysSet = new HashSet<>();
        paysSet.add(new Pays("United states", 331000000, 65799.59));
        paysSet.add(new Pays("France", 67886000, 41463.21));
        paysSet.add(new Pays("Allemagne", 83190556, 46930.54));
        paysSet.add(new Pays("United Kingdom", 67545757, 42585.84));
        paysSet.add(new Pays("Italie", 60359546, 35498.39));
        paysSet.add(new Pays("Japon", 125360000, 44492.98));
        paysSet.add(new Pays("Chine", 1404328611, 10588.47));
        paysSet.add(new Pays("Russie", 146599183, 10956.77));
        paysSet.add(new Pays("Inde", 1380004385, 2109.85));

        System.out.println("HashSet de pays initial :");
        afficherPaysSet(paysSet);

        
        // Rechercher le pays avec le PIB par habitant le + important
        Pays paysAvecPibHabitantMax = rechercherPaysAvecPibHabitantMax(paysSet);
        System.out.println("- Pays avec le PIB par habitant le + élevé : " + paysAvecPibHabitantMax.getNom());

        // Rechercher le pays avec le PIB total le + important
        Pays paysAvecPibTotalMax = rechercherPaysAvecPibTotalMax(paysSet);
        System.out.println("- Pays avec le PIB total le + élevé : " + paysAvecPibTotalMax.getNom());

        // UpperCase le pays avec le PIB total le + petit    
        Pays paysAvecPibTotalMin = rechercherPaysAvecPibTotalMin(paysSet);
        paysAvecPibTotalMin = new Pays(paysAvecPibTotalMin.getNom().toUpperCase(), paysAvecPibTotalMin.getPopulation(), paysAvecPibTotalMin.getPibParHabitant());
        System.out.println("Pays avec le PIB total le plus bas mis en majuscules : " + paysAvecPibTotalMin.getNom());

        
        // le supprimer 
        paysSet.remove(paysAvecPibTotalMin);

        // Afficher
        System.out.println("HashSet de pays modifié :");
        afficherPaysSet(paysSet);
    }

	
	
	
	

    public static Pays rechercherPaysAvecPibHabitantMax(HashSet<Pays> paysSet) {
        Pays paysAvecPibHabitantMax = null;
        double pibHabitantMax = Double.MIN_VALUE;

        for (Pays pays : paysSet) {
            if (pays.getPibParHabitant() > pibHabitantMax) {
                pibHabitantMax = pays.getPibParHabitant();
                paysAvecPibHabitantMax = pays;
            }
        }

        return paysAvecPibHabitantMax;
    }

    public static Pays rechercherPaysAvecPibTotalMax(HashSet<Pays> paysSet) {
        Pays paysAvecPibTotalMax = null;
        double pibTotalMax = Double.MIN_VALUE;

        for (Pays pays : paysSet) {
            double pibTotal = pays.getPopulation() * pays.getPibParHabitant();
            if (pibTotal > pibTotalMax) {
                pibTotalMax = pibTotal;
                paysAvecPibTotalMax = pays;
            }
        }

        return paysAvecPibTotalMax;
    }

    public static Pays rechercherPaysAvecPibTotalMin(HashSet<Pays> paysSet) {
        Pays paysAvecPibTotalMin = null;
        double pibTotalMin = Double.MAX_VALUE;

        for (Pays pays : paysSet) {
            double pibTotal = pays.getPopulation() * pays.getPibParHabitant();
            if (pibTotal < pibTotalMin) {
                pibTotalMin = pibTotal;
                paysAvecPibTotalMin = pays;
            }
        }

        return paysAvecPibTotalMin;
    }
    
    public static void afficherPaysSet(HashSet<Pays> paysSet) {
    	System.out.println("-------------------------------------------");
        for (Pays pays : paysSet) {
            System.out.println("| " + pays);
        }
    	System.out.println("-------------------------------------------");

    }
    
    public static void afficherPaysNom(HashSet<Pays> paysSet) {
    	System.out.println("-------------------------------------------");
        for (Pays pays : paysSet) {
            System.out.println("| " + pays.getNom());
        }
    	System.out.println("-------------------------------------------");

    }
}