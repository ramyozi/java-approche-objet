package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
        Compte compte = new Compte("12345", 1000.0);
        System.out.println("Initial Balance : " + compte.getSolde());
        System.out.println();
		
		Operation[] operations = new Operation[4];
        operations[0] = new Credit("2023-10-01", 1000.0);
        operations[1] = new Debit("2023-10-05", 500.0);
        operations[2] = new Credit("2023-10-10", 1500.0);
        operations[3] = new Debit("2023-10-15", 300.0);
        
       
        System.out.println("Operation Details:");
        double totalAmount = 0.0;

        for (Operation operation : operations) {
            System.out.println("Type: " + operation.getType());
            System.out.println("Date: " + operation.getOperationDate());
            System.out.println("Amount: " + operation.getAmount());

            if (operation instanceof Credit) {
                compte.setSolde(compte.getSolde() + operation.getAmount());
            } else if (operation instanceof Debit) {
                compte.setSolde(compte.getSolde() - operation.getAmount());
            }

            totalAmount += (operation instanceof Credit) ? operation.getAmount() : -operation.getAmount();
            System.out.println("Updated Balance after Operation: " + compte.getSolde());
            System.out.println();
        }

        System.out.println("Final Balance: " + compte.getSolde());
        
        System.out.println("Total Amount: " + (totalAmount >= 0 ? "+" : "-") + Math.abs(totalAmount));
	}

}
