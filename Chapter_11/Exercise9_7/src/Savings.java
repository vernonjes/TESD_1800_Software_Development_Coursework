
public class Savings extends Account {
	private double balance = 0;
	
	public Savings(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	
	@Override
	public double withdraw(double take) {
		return this.balance -= take;
	}
	
	@Override
	public double deposit(double give) {
		return this.balance += give;
	}
	
	@Override
	public String toString() {
		return "The balance is: $" + balance + "\nThe date created: " + getDate();
	}
}
