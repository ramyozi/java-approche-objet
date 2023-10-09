package fr.diginamic.banque.entites;

public class Credit extends Operation{

	public Credit(String operationDate, double amount) {
		super(operationDate, amount);
	}

    @Override
    public String getType() {
        return "Credit";
    }

}
