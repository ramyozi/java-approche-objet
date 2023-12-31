package fr.diginamic.banque.entites;

public class Compte {
    private String numeroCompte;
    protected double solde;

    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
	public double calculerMontant() {
		return this.solde;
	}
    
    @Override
    public String toString() {
        return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
    }
}
