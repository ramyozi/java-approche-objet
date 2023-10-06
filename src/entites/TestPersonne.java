package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(123, "Rue de la julimont", 35000, "Rennes");
        AdressePostale adresse2 = new AdressePostale(456, "Rue du pibrac", 69000, "Lyon");

        Personne personne1 = new Personne("Ali", "Baba", adresse1);
        Personne personne2 = new Personne("Harry", "Potter", adresse2);
		
		
	}

}
