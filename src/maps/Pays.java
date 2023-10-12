package maps;

public class Pays {
	private String nomn;
	private long nbHab;
	private String continent;
	
	public Pays(String nomn, long nbHab, String continent) {
		super();
		this.nomn = nomn;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	public String getNomn() {
		return nomn;
	}

	public void setNomn(String nomn) {
		this.nomn = nomn;
	}

	public long getNbHab() {
		return nbHab;
	}

	public void setNbHab(long nbHab) {
		this.nbHab = nbHab;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Pays [nomn=" + nomn + ", nbHab=" + nbHab + ", continent="
				+ continent + "]";
	}
	
	
}
