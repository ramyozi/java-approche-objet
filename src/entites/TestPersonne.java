package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(123, "Rue de la julimont", 35000, "Rennes");
        AdressePostale adresse2 = new AdressePostale(456, "Rue du pibrac", 69000, "Lyon");

        Personne personne1 = new Personne("Ali", "Baba", adresse1);
        Personne personne2 = new Personne("Harry", "Potter", adresse2);
		
        // Afficher les informations initiales
        afficherInfoPersonne(personne1);

        afficherInfoPersonne(personne2);

        // Modifier l'adresse de personne1
        AdressePostale nouvelleAdresse = new AdressePostale(789, "Rue de la Paix", 75001, "Paris");
        personne1.ModifierAdresse(nouvelleAdresse);

        afficherInfoPersonne(personne1);

    }
	
	public static void afficherInfoPersonne(Personne personne) {
        System.out.println("Nom : " + personne.getNom());
        System.out.println("Prénom : " + personne.getPrenom());
        System.out.println("Adresse : " + personne.getAdresse().numeroRue + " " +
                personne.getAdresse().libelleRue + ", " +
                personne.getAdresse().codePostal + " " +
                personne.getAdresse().ville);
        System.out.println();
    }
	

}
