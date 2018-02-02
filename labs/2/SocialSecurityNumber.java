import java.util.Scanner;


public class SocialSecurityNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ask user to enter Social Security Number
		System.out.print("Enter your Social Security Number in the format DDD-DD-DDDD: ");
		String ssn = input.nextLine();
		
		for (int s = 0 ; s < ssn.length() ; s++) {
			if (s == 3 || s == 6)
				if (ssn.charAt(s) == '-')
					continue;
				else {
					System.out.print(ssn + " is an invalid social security number");
					return;
				}
			else {
				if (Character.isDigit(ssn.charAt(s)))
					continue;
				else {
					System.out.print(ssn + " is an invalid social security number");
					return;
				}
			}
		}
		System.out.print(ssn + " is a valid social security number");
	}

}
