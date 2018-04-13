
public class CircleExercise {

	public static void main(String[] args) {
		
		// Create three new circle object
		Circle circle1 = new Circle(3, "red", true);
		Circle circle2 = new Circle(3, "blue", false);
		Circle circle3 = new Circle(5, "blue", false);
		
		// Display if circle1, circle2, and circle3 is equal to each other
		System.out.println("Is Circle 1 equal to Circle 2? " + (circle1.equals(circle2))); 

		System.out.println("Is Circle 1 equal to Circle 3? " + (circle1.equals(circle3))); 
		
		System.out.println("Is Circle 2 equal to Circle 3? " + (circle2.equals(circle3))); 
	}
}

