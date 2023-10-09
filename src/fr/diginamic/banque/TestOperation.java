package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations = new Operation[4];
        operations[0] = new Credit("2023-10-01", 1000.0);
        operations[1] = new Debit("2023-10-05", 500.0);
        operations[2] = new Credit("2023-10-10", 1500.0);
        operations[3] = new Debit("2023-10-15", 300.0);
        
        for (Operation o : operations){
        	System.out.println(o);
        }

	}

}
