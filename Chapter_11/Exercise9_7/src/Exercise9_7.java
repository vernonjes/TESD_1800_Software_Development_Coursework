
public class Exercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		Account savingsAccount = new Savings(2000);
		System.out.println(savingsAccount.toString());
		savingsAccount.withdraw(500);
		System.out.println(savingsAccount.toString());
		
		System.out.println();
		
		Account checkingAccount = new Checking(2000);
		System.out.println(checkingAccount.toString());
		checkingAccount.withdraw(500);
		System.out.println(checkingAccount.toString());
		
		System.out.println();
		
		System.out.printf("Your balance is: $%.2f" + 
				"\nYour monthly interest is: %.1f%%", account1.getBalance(), account1.getMonthlyInterest());
		System.out.println("\nThe date this account was create is " + account1.getDate());
		
	}

}
