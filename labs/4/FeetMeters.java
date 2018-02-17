
public class FeetMeters {

	public static void main(String[] args) {
		// Table
		System.out.println(
				"Feet           Meters    |     Meters        Feet");
		for (double feet = 1, meters = 20; feet <= 10 && meters <= 65; 
				feet += 1, meters += 5) {
			System.out.printf(
					"%-10.1f%10.3f", feet, footToMeter(feet));
			System.out.print("     |     ");
			System.out.printf(
					"%-10.1f%10.3f\n",
					meters, (meterToFoot(meters)));
		}
	}
	
	// Method to convert meters to feet
	private static double meterToFoot(double meters) {
		double feet = 3.279 * meters;
		return feet;
	}

	// Method to convert feet to meters
	private static double footToMeter(double feet) {
		double meters = 0.305 * feet;
		return meters;
	}

}
