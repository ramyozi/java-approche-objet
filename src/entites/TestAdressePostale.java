package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale A = new AdressePostale();
		AdressePostale B = new AdressePostale();
		
		A.rue = 12;
		A.labele = "Rue de Bayorne";
		A.c_postale = 31000;
		A.ville = "Toulouse";
		
		B.rue = 15;
		B.labele = "Rue de tweet";
		B.c_postale = 93120;
		B.ville = "La courneuve";
	}

}
