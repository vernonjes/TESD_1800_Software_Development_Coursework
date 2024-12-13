
class Account {
	
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date();
	
	
	Account() {
		
	}
	
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = (newId >= 0) ? newId : 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = (newBalance >= 0) ? newBalance : 0;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = (newAnnualInterestRate >= 0) ? newAnnualInterestRate : 0;
	}
	
	public String getDate() {
		return dateCreated.toString();
	}
	
//-------------------------------------------------------
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public double withdraw(double newWithdraw) {
		return balance -= newWithdraw;
	}
	
	public double deposit(double newDeposit) {
		return balance += newDeposit;
	}
	
}
