package fr.diginamic.banque.entites;

public class Debit extends Operation{

	public Debit(String operationDate, double amount) {
		super(operationDate, amount);
	}
	 @Override
	    public String getType() {
	        return "Debit";
	    }
}
