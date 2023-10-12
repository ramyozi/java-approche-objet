package tri;

public class Ville implements Comparable<Ville> {
	private String nom;
	private long nbHabitant;
	
	public Ville(String nom, long nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	  public String getNom() {
			return nom;
		}

		public long getNbHabitant() {
			return nbHabitant;
		}

	  public void setNom(String nom) {
			this.nom = nom;
		}
		
		public void setNbHabitant(long nbHabitant) {
			this.nbHabitant = nbHabitant;
		}
	  

		@Override
		public int compareTo(Ville v) {
		    return Long.compare(nbHabitant, v.nbHabitant);
		}

	}