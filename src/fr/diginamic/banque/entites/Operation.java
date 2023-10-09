package fr.diginamic.banque.entites;

public abstract class Operation {
	String operationDate;
	double amount;
	
	public Operation(String operationDate, double amount) {
		this.operationDate = operationDate;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Operation [operationDate=" + operationDate + ", amount="
				+ amount + "]";
	}

    public String getOperationDate() {
		return operationDate;
	}

	public double getAmount() {
		return amount;
	}

	public abstract String getType();
}
