
public class SquareExercise {

	public static void main(String[] args) {
		
		// Create an array of five new square objects
		GeometricObject[] squares = {new Square(4), new Square(10), new Square(15), 
				    										new Square(3), new Square(5)};

		// For each square, display area and how to color
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("Square " + (i + 1));
		 	System.out.println("Area of square is: " + squares[i].getArea());
		 	System.out.println("How to color square: " + ((Square)squares[i]).howToColor());
		 } 
	}

}
