package tri;

import java.util.Comparator;


public class ComparatorHabitant implements Comparator<Ville> {

	@Override
    public int compare(Ville v1, Ville v2) {
        long habitants1 = v1.getNbHabitant();
        long habitants2 = v2.getNbHabitant();

        if (habitants1 < habitants2) {
            return -1;
        } else if (habitants1 > habitants2) {
            return 1;
        } else {
            return 0;
        }
    } 
}
