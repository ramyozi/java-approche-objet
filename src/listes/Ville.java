package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	private String nom;
	private int nbHabitant;
	private Continent continent; // Ajout de l'attribut Continent

	public Ville(String nom, int nbHabitant, Continent continent) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent; // Initialisation Continent
	}

	public void mettreNomEnMajusculesSiPopulationSuperieureA(int seuil) {
		if (this.nbHabitant > seuil) {
			this.nom = this.nom.toUpperCase();
		}
	}

	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Ville ville = (Ville) o;

		if (nbHabitant != ville.nbHabitant) {
			return false;
		}
		return nom != null ? nom.equals(ville.nom) : ville.nom == null;
	}
	
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitant=" + nbHabitant +
                ", continent='" + continent.getLibelle() + '\'' +
                '}';
    }


}
