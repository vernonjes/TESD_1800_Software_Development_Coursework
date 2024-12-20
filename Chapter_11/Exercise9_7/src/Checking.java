
public class Checking extends Account {
	private double balance = 0;
	private int limit = 100;
	
	public Checking(double balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	
	@Override
	public double withdraw(double take) {
		if (take < limit) {
			return this.balance -= take;
		} else
			System.out.println("Your withdrawing the overdraft limit.");
			return this.balance -= limit;
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
