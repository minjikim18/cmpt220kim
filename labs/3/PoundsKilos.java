
public class PoundsKilos {


		public static void main(String[] args) {
			// Constant for number of pounds in kilo
			final double POUNDS_PER_KILO = 2.2;

			// Table
			System.out.println(
				"Kilograms    Pounds     |     Pounds      Kilograms");
			for (int kilo = 1, pounds = 20; kilo <= 199 && pounds <= 515; kilo += 2,
					pounds += 5) {
				System.out.printf(
					"%-12d%7.1f", kilo, (kilo * POUNDS_PER_KILO));
				System.out.print("     |     ");
				System.out.printf(
					"%-9d%12.2f\n",
					pounds, (pounds / POUNDS_PER_KILO));
			}
		}
	}