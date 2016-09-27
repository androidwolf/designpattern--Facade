package Facade;

public class CheckWord {
	public final int basicAmount = 85;
	String advertisement;
	int amount;

	public CheckWord(String advertisement) {
		this.advertisement = advertisement;
	}

	public void setAmount() {
		this.amount = this.advertisement.length() + basicAmount;
	}

	public int getAmount() {
		return this.amount;
	}

}
