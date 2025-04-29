
import java.io.*;

public class Exercise17_07 {
	public static void main(String[] args) throws FileNotFoundException {
			Loan loan1 = new Loan();
			Loan loan2 = new Loan(1.8, 10, 10000);
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
) {
	output.writeObject(loan1);
	output.writeObject(loan2);
}
	catch (IOException ex) {
			System.out.println("File could not be opened");
		}
		
		
		outputData();
	}
	
	
	public static void outputData() {
		
		double totalLoanAmount = 0;
		
		try (ObjectInputStream input = new ObjectInputStream (new FileInputStream("Exercise17_07.dat"))){
			while (true) {
				Loan loan = (Loan) input.readObject();
				totalLoanAmount += loan.getLoanAmount();
			}
		} catch (EOFException eof) {
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("An error occured:");
			e.printStackTrace();
		}
		
		System.out.println("The total loan amount is: $" + totalLoanAmount);
	}
}
