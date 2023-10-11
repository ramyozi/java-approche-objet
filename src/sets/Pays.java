package sets;


class Pays {
    private String nom;
    private double population;
    private double pibParHabitant;

    public Pays(String nom, double population, double pibParHabitant) {
        this.nom = nom;
        this.population = population;
        this.pibParHabitant = pibParHabitant;
    }

    public String getNom() {
        return nom;
    }

    public double getPopulation() {
        return population;
    }

    public double getPibParHabitant() {
        return pibParHabitant;
    }

    public double getPibTotal() {
        return population * pibParHabitant;
    }

    @Override
    public String toString() {
        return nom + ", Population : " + population + " hab., PIB/Habitant : " + pibParHabitant;
    }
}