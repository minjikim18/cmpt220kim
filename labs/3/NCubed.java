
public class NCubed {

	public static void main(String[] args) {
		int n = 0;
		
		// find the largest n such that n^3 is smaller than 12000
		while (Math.pow(n+1, 3) < 12000)
			n++;
		
		// Print out result 
		System.out.print("The largest integer n such that n^3 is smaller than 12,000 is " + n);

	}

}
