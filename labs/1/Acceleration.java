import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt users to enter starting velocity, ending velocity, and time span
		System.out.print("Enter your starting velocity in meters/second: ");
		double sVel = input.nextDouble();
		System.out.print("Enter your ending velocity in meters/second: ");
		double eVel = input.nextDouble();
		System.out.print("Enter your time span in seconds: ");
		double time = input.nextDouble();
		
		// Calculate average acceleration 
		double average = (eVel - sVel) / time;
		System.out.println("The average acceleration is: " + average);
	}

}
