package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		List<Ville> MaListe = new ArrayList<>();

		MaListe.add(new Ville("Nice", 343000));
        MaListe.add(new Ville("Carcassonne", 47800));
        MaListe.add(new Ville("Narbonne", 53400));
        MaListe.add(new Ville("Lyon", 484000));
        MaListe.add(new Ville("Foix", 9700));
        MaListe.add(new Ville("Pau", 77200));
        MaListe.add(new Ville("Marseille", 850700));
        MaListe.add(new Ville("Tarbes", 40600));		
	}

}
