
public class Exercise1311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Octagon octagon = new Octagon(8);
		
		Octagon octagon2 = octagon.clone();
		
		System.out.println(octagon.compareTo(octagon2));
	}

}
