import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;



public class Exercise17_01 {
	public static void main (String[] args) {
		File file = new File ("Exercise17_01.txt");
		
		Random random = new Random();
		
		try (FileWriter writer = new FileWriter(file, true)){
			for (int i = 0; i < 100; i++) {
				int number = random.nextInt(1000);
				writer.write(number + " ");
			}
			writer.write("\n");
			System.out.println("100 random integers written to " + file.getName());
			
		} catch (IOException e) {
			System.out.println("An error occured:");
			e.printStackTrace();
		}
	}
}
