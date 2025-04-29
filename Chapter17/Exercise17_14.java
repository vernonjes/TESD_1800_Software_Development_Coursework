import java.io.*;
import java.util.Scanner;

public class Exercise17_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the input file name: ");
		String inputFileName = scanner.nextLine();
		
		System.out.print("Enter the output (encrypted) file name: ");
		String outputFileName = scanner.nextLine();
		
		try (FileInputStream input = new FileInputStream(inputFileName);
				FileOutputStream output = new FileOutputStream(outputFileName)) {
			
			int byteData;
			while ((byteData = input.read()) != -1) {
				output.write(byteData + 5);
			}
			
			System.out.println("File excrypted successfully");
			
		} catch (IOException e) {
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
	}
}
