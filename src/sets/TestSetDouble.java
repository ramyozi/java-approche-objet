package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		 HashSet<Double> set = new HashSet<Double>();
		 set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);
        
        // Afficher
        System.out.println("Éléments du HashSet : " + set);

        // Recherchez le plus grand 
        double max = Double.MIN_VALUE;
        for (double element : set) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Plus grand élément : " + max);
        
     // Supprimez le plus petit 
        double min = Double.MAX_VALUE;
        double elementASupprimer = 0.0;
        for (double element : set) {
            if (element < min) {
                min = element;
                elementASupprimer = element;
            }
        }
        set.remove(elementASupprimer);
        
        System.out.println("HashSet après suppression du plus petit élément : " + set);

        
	}

}
