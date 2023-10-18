/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * 
 */
/**
 * Cette énumération représente les saisons avec leur libellé et leur numéro d'ordre.
 */
public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Été", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String libelle;
    private int numeroOrdre;

    /**
     * Constructeur de l'énumération Saison.
     *
     * @param libelle     Le libellé de la saison.
     * @param numeroOrdre Le numéro d'ordre de la saison.
     */
    Saison(String libelle, int numeroOrdre) {
        this.libelle = libelle;
        this.numeroOrdre = numeroOrdre;
    }

    /**
     * Obtient le libellé de la saison.
     *
     * @return Le libellé de la saison.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Obtient le numéro d'ordre de la saison.
     *
     * @return Le numéro d'ordre de la saison.
     */
    public int getNumeroOrdre() {
        return numeroOrdre;
    }

    /**
     * Recherche une saison par son libellé.
     *
     * @param libelle Le libellé de la saison à rechercher.
     * @return L'instance de Saison correspondant au libellé, ou null si aucune saison ne correspond.
     */
    public static Saison getSaisonByLibelle(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.getLibelle().equalsIgnoreCase(libelle)) {
                return saison;
            }
        }
        return null; // Retourne null si aucune saison ne correspond au libellé
    }
}