package listes;

public class Ville {
	private String nom;
	private int nbHabitant;
	
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}
	
	public void mettreNomEnMajusculesSiPopulationSuperieureA(int seuil) {
        if (this.nbHabitant > seuil) {
            this.nom = this.nom.toUpperCase();
        }
    }

/*	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
*/
	
}
