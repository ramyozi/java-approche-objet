package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Allemagne");
        countries.add("UK");
        countries.add("Italie");
        countries.add("Japon");
        countries.add("Chine");
        countries.add("Russie");
        countries.add("Inde");
        
        String paysAvecPlusDeLettres = trouverPaysAvecPlusDeLettres(countries);
        countries.remove(paysAvecPlusDeLettres);
        System.out.println("HashSet de pays après suppression : " + countries);

        
        
	}
	public static String trouverPaysAvecPlusDeLettres(HashSet<String> countries) {
        String paysAvecPlusDeLettres = "";
        int maxNombreLettres = 0;

        for (String country : countries) {
            if (country.length() > maxNombreLettres) {
                maxNombreLettres = country.length();
                paysAvecPlusDeLettres = country;
            }
        }

        return paysAvecPlusDeLettres;
    }
}
