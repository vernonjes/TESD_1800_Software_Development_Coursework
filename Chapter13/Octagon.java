
import java.util.*;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;
	
	public Octagon() {
		this.side = 1.0;
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	
	@Override
	public double getArea() {
		return (2 + 4 / (Math.sqrt(2)) * side * side);
	}
	
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public Octagon clone() {
		try {
			return (Octagon) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
