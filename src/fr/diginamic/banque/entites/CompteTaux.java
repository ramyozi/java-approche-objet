package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
    private double tauxDeRemuneration;


	public CompteTaux(String numeroCompte, double solde, double tauxDeRemuneration) {
		super(numeroCompte, solde);
        this.tauxDeRemuneration = tauxDeRemuneration;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", tauxDeRemuneration=" + tauxDeRemuneration;
    }

}
