package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adressePostale;
    }
	
	public void AfficherNomCompletPersonne() {
        System.out.println(this.prenom + " " + this.nom.toUpperCase());
    }
	
	public void ModifierNom(String nouveau_nom) {
		this.nom = nouveau_nom;
	}
	
	public void ModifierPrenom(String nouveau_prenom) {
		this.prenom = nouveau_prenom;
	}
	
	public void ModifierAdresse (AdressePostale nouvelle_adresse) {
		this.adresse = nouvelle_adresse;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdresse() {
		return this.adresse;
	}
	
}
