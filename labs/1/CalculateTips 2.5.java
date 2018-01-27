import java.util.Scanner;

public class CalculateTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for subtotal and gratuity rate 
		System.out.print("What is your total?");
		double price = input.nextDouble();
		
		System.out.print("What is the gratuity rate?");
		double rate = input.nextDouble();
		
		//Calculation 
		double gratuity  = price * (rate/100);
		double overall = price + gratuity;
		
		//Print out gratuity and total
		System.out.println("Your gratuity is: $" + gratuity);
		System.out.println("Your overall total is: $" + overall);
	}

}
