
import java.util.Scanner;
public class Exercise9_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean menu = true;
		int id = enterId();
		
		Scanner input = new Scanner(System.in);
		
		Account account0 = new Account(0, 100);
		Account account1 = new Account(1, 100);
		Account account2 = new Account(2, 100);
		Account account3 = new Account(3, 100);
		Account account4 = new Account(4, 100);
		Account account5 = new Account(5, 100);
		Account account6 = new Account(6, 100);
		Account account7 = new Account(7, 100);
		Account account8 = new Account(8, 100);
		Account account9 = new Account(9, 100);
	
		System.out.println();
		
	while (menu) {
		System.out.println("Main Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.println();
		System.out.println("Enter a choice: ");
		
		int choice = input.nextInt();
		
		if (choice == 1) {
			System.out.println("The balance is " + account2.getBalance());
		} else if (choice == 2) {
			System.out.println("Enter an amount to withdraw: ");
			int withdraw = input.nextInt();
			account2.withdraw(withdraw);
		} else if (choice == 3) {
			System.out.println("Enter an amount to deposit: ");
			int deposit = input.nextInt();
			account2.deposit(deposit);
		} else if (choice == 4) {
			menu = false;
			enterId();
			menu = true;
		}
		}	
	}
	
	
	public static int enterId() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an id: ");
		
		int id = input.nextInt();
		
		if (id > 9) {
			System.out.println("Invalid Input. Try Again.");
			System.out.println("Enter an id: ");
			id = input.nextInt();
			while (id > 9) {
				System.out.println("Invalid Input. Try Again.");
				System.out.println("Enter an id: ");
				id = input.nextInt();
			}
		}
		return id;
	}
}

