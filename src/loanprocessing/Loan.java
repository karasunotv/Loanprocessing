package loanprocessing;

public class Loan {

	private double amount;
	private double rateOfInterest;

	public Loan(double amount, double rateOfInterest) {
		super();
		this.amount = amount;
		this.rateOfInterest = rateOfInterest;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "Loan [amount=" + amount + ", rateOfInterest=" + rateOfInterest + "]";
	}

}
