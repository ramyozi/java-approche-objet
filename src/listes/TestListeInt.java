package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);
        
        
        System.out.println("Contenu de la liste avant modification: " + liste);
        System.out.println("taille de la liste : " + liste.size());

        // une façon de faire
        int max = 0;
        for (int number : liste) {
        	if (number>max) {
        		max = number;
        	}
        }
        System.out.println("le plus grand élément de la liste est " + max);

        // une autre façon (en utilisant la biblio collections
        int min = Collections.min(liste);
        System.out.println("le plus petit élément de la liste est " + min);
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément : " + liste);

        
        for (int i = 0; i < liste.size(); i++) {
            int element = liste.get(i);
            if (element < 0) {
            	liste.set(i, Math.abs(element));
            }
        }
        
        System.out.println("Contenu de la liste apres modification: " + liste);

	}

}
