package entites;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 123;
        adresse1.libelleRue = "Rue de la Liberte";
        adresse1.codePostal = 35000;
        adresse1.ville = "Paris";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 456;
        adresse2.libelleRue = "Rue du Commerce";
        adresse2.codePostal = 69545;
        adresse2.ville = "Lyon";

        Personne personne1 = new Personne();
        personne1.nom = "Dupont";
        personne1.prenom = "Jean";
        personne1.AdressePostale = adresse1;

        Personne personne2 = new Personne();
        personne2.nom = "Martin";
        personne2.prenom = "Sophie";
        personne2.AdressePostale = adresse2;
		
		
	}

}
