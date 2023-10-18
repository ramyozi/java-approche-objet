/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * 
 */
public enum Continent {
    EUROPE("Europe"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}

