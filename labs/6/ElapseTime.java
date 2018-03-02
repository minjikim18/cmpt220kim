
public class ElapseTime {

	public static void main(String[] args) {
		
		// Create a date object
		java.util.Date date = new java.util.Date();
		
		// Display date and time for each
		System.out.println("The dates and times for elapsed times 10000, 100000,"
								+ "1000000, 10000000,\n100000000, 1000000000," + 
											"10000000000, and 100000000000 is ");
				for (long i = 10000; i <= 1e11; i *= 10) {
							date.setTime(i);
				System.out.println(date.toString());
				}
	}

}
