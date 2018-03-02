import java.util.GregorianCalendar;

public class Calendar {

	public static void main(String[] args) {
		
		// Create an object calendar for GregorainCalendar
		GregorianCalendar calendar = new GregorianCalendar();

		// Print out current year, month, and day
		System.out.println("Current year, month, and day:" );
		System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" +  
							calendar.get(GregorianCalendar.MONTH) + "/" +
							calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		// Print out year, month, and day after elapse time of 1234567898765L
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Elapse time since January 1, 1970 set to 1234567898765L");
		System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" +  
				calendar.get(GregorianCalendar.MONTH) + "/" +
				calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
