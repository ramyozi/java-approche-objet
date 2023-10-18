package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        // Afficher toutes les saisons
        System.out.println("Toutes les saisons :");
        for (Saison saison : Saison.values()) {
            System.out.println(saison.name() + " - " + saison.getLibelle() + " (Numéro d'ordre : " + saison.getNumeroOrdre() + ")");
        }

        // Recherche et affichage de la saison par son nom
        String nom = "ETE";
        Saison saisonByNom = Saison.valueOf(nom);
        System.out.println("\nSaison par nom (" + nom + ") : " + saisonByNom.getLibelle());

        // Recherche de la saison par libellé
        String libelle = "Hiver";
        Saison saisonByLibelle = Saison.getSaisonByLibelle(libelle);
        if (saisonByLibelle != null) {
            System.out.println("Saison par libellé (" + libelle + ") : " + saisonByLibelle.name());
        } else {
            System.out.println("Aucune saison trouvée avec le libellé : " + libelle);
        }
    }
}
