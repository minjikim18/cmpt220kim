import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		//Prompt the user for temperature in Celcius 
		System.out.print("Enter a Temperature in Celcius:");
		double temp = input.nextDouble();
		
		//Convert Celcius to Farenheit 
		double farenheit = (9.0/5) * temp + 32;
		
		//Print out conversion
		System.out.println("The Temperature in Farenheit is:" + farenheit);
	}

}
