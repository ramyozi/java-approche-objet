package fichier;

class Ville {
    private String nom;
    private String codeDep;
    private String nomRegion;
    private int nbPopulation;

    public Ville(String nom, String codeDep, String nomRegion, int nbPopulation) {
        this.nom = nom;
        this.codeDep = codeDep;
        this.nomRegion = nomRegion;
        this.nbPopulation = nbPopulation;
    }

    

    public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getCodeDep() {
		return codeDep;
	}



	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}



	public String getNomRegion() {
		return nomRegion;
	}



	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}



	public int getNbPopulation() {
		return nbPopulation;
	}



	public void setNbPopulation(int nbPopulation) {
		this.nbPopulation = nbPopulation;
	}



	@Override
    public String toString() {
        return "Ville [nom=" + nom + ", code Departement=" + codeDep + ", nom Region=" + nomRegion + ", population Totale=" + nbPopulation + "]";
    }
}