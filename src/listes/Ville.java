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

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ville ville = (Ville) o;

        if (nbHabitant != ville.nbHabitant) return false;
        return nom != null ? nom.equals(ville.nom) : ville.nom == null;
    }
	
}
