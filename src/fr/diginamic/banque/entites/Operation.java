package fr.diginamic.banque.entites;

public abstract class Operation {
	String operationDate;
	double amount;
	
	public Operation(String operationDate, double amount) {
		this.operationDate = operationDate;
		this.amount = amount;
	}

	
}
