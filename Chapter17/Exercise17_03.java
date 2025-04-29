import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.util.Random;


public class Exercise17_03 {
	public static void main(String[] args) {
		writeRandomIntegers();
		
	}
	
	public static void writeRandomIntegers() {
		File file = new File ("Exercise17_03.dat");
		Random random = new Random();
		
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream(file, true))) {
			 for (int i = 0; i < 100; i++) {
				 int number = random.nextInt(1000);
				 output.writeInt(number);
			 }
			 System.out.println("100 random integers were written in " + file.getName());
			 
			 
			 int sum = readAndSumIntegers();
			 System.out.println("The sum of all of the integers is: " + sum);
		} catch (IOException e) {
			System.out.println("An error occured:");
			e.printStackTrace();
		}
	}
	
	public static int readAndSumIntegers() {
		File file = new File ("Exercise17_03.dat");
		int sum = 0;
		
		try(DataInputStream input = new DataInputStream(new FileInputStream(file))) {
			while (true) {
				sum += input.readInt();
			}
		} catch (EOFException eof) {
			
		} catch (IOException e) {
			System.out.println("An error occured:");
			e.printStackTrace();
		}
		
		return sum;
	}
}
