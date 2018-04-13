
public class OctagonExercise {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Create a new Octagon object with side 5
		Octagon octagon = new Octagon(5);
		
		// Display octagon's area and perimeter
		System.out.println("Area of Octagon is " + octagon.getArea());
		System.out.println("Perimeter of Octagon is " + octagon.getPerimeter());
		
		// Clone Octagon
		Octagon octagonClone = (Octagon)octagon.clone();

		// Compare octagon and clone then display result
		int result = (octagon.compareTo(octagonClone));
		if (result == 1)
			System.out.println("Octagon is bigger than its clone.");
		else if (result == -1)
			System.out.println("Octagon is smaller than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}

}
