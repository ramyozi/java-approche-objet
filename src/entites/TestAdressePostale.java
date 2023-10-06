package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale A = new AdressePostale();
		AdressePostale B = new AdressePostale();
		
		A.numeroRue = 12;
		A.libelleRue = "Rue de Bayorne";
		A.codePostal = 31000;
		A.ville = "Toulouse";
		
		B.numeroRue = 15;
		B.libelleRue = "Rue de tweet";
		B.codePostal = 93120;
		B.ville = "La courneuve";
	}

}
