package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestListeInt {

	public static void main(String[] args) {
		
		// diff ways to do it
		int[] liste1 = {-1, 5, 7, 3, -2, 4, 8, 5};
		List<Integer> liste2 = new ArrayList<Integer>();
        List<Integer> liste3 = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        List<Integer> liste4 = new ArrayList<Integer>();
        liste4.add(-1);
        liste4.add(5);
        liste4.add(7);
        liste4.add(3);
        liste4.add(-2);
        liste4.add(4);
        liste4.add(8);
        liste4.add(5);
	}

}
