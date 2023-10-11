package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

		System.out.println("Ma liste (etat initial): " + villes);
		System.out.println();

        String villeAvecLePlusDeLettres = trouverVilleAvecLePlusDeLettres(villes);
        System.out.println("Ville avec le plus grand nombre de lettres : " + villeAvecLePlusDeLettres);
        
        AllCaps(villes);
        System.out.println("Ma liste de ville en Maj : " + villes);

        SuppVilleCommenceParN(villes);
        System.out.println("Ma liste après suppression des villes commençant par 'N': " + villes);
        System.out.println();
		System.out.println("Ma liste (etat final): " + villes);


	}
	public static void AllCaps(List<String> villes) {
		for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
	}
	
	public static void SuppVilleCommenceParN(List<String> villes) {
		Iterator<String> iterator = villes.iterator();
        while (iterator.hasNext()) {
            String ville = iterator.next();
            if (ville.startsWith("N")) {
                iterator.remove();
            }
        }	
	}

	
	public static String trouverVilleAvecLePlusDeLettres(List<String> villes) {
        String villeMax = "";
        int longueurMax = 0;

        for (String ville : villes) {
            int longueurVille = ville.length();
            if (longueurVille > longueurMax) {
                longueurMax = longueurVille;
                villeMax = ville;
            }
        }

        return villeMax;
    }
}
