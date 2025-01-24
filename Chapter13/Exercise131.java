

public class Exercise131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] objects = new GeometricObject[5];
		
		objects[0] = new Triangle(1,2,3);
		objects[1] = new Triangle(6,5,4);
		objects[2] = new Triangle(7,8,9);
		objects[3] = new Triangle(1,3,4);
		objects[4] = new Triangle(5,6,7);
		
		for(GeometricObject object : objects) {
			System.out.println("Area: " + object.getArea());
			
			
			if (object instanceof Colorable) {
				((Colorable) object).howToColor();
			}
		}
	}

}
