
public class SumSeries {

	public static void main(String[] args) {
		// Table
		System.out.println( "i             m(i)       ");
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-10.0f%10.4f\n", i, sumSeries(i));
		}

	}

	// Method of sum series 
	private static double sumSeries(double i) {
		double sum = 0;
		for (double i1 = 1; i1 <= i; i1++ ) {
			sum += i1 / (i1 + 1);
		
		}
		return sum;
	}

}
