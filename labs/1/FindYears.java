import java.util.Scanner;

public class FindYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter minutes
		System.out.print("Enter minutes: ");
		double minutes = input.nextDouble();
		
		//Conversion from minutes to years & days
		double years = minutes / 525600;
		double days = (years - (int)years) * 365;
		System.out.println((int)years + " years " + (int)days + " days ");
	}

}
