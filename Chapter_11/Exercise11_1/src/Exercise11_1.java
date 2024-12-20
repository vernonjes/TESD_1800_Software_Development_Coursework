
import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean isFilled;
		
		java.util.Date dateCreated = new java.util.Date();
		
		System.out.println("Please enter 3 sides of the triangle: ");
		
		double o = input.nextDouble();
		double t = input.nextDouble();
		double th = input.nextDouble();
		input.nextLine();
		
		Triangle triangle = new Triangle(o, t, th);
		
		System.out.println("Now please enter a color: ");
		
		String color = input.nextLine();
		
		isFilled = true;
		
		System.out.print("The area is: " + triangle.getArea()
		+ "\nThe perimeter is: " + triangle.getPerimeter()
		+ "\nThe color is: " + color + "\nThe dated created: " + dateCreated
		+ "\nIs the triangle filled?: " + isFilled);
		
	}

}
