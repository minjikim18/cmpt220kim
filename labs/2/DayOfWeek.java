import java.util.Date;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);

		// Ask user to enter today's date
		System.out.println("Enter today's date: (0 for sunday, 1 for monday...) ");
		int day = input.nextInt(); //date.getDate();
		
		// Days based on the number user inputs
		switch (day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
				
		}
		
		// Ask user to enter number of days after today's date for a future date
		System.out.println("Enter the number of days after today for a future date");
		int futureDate = input.nextInt();
		
		// Future day based on user's input
		switch ((day + futureDate) % 7) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			
		}
	}
}

