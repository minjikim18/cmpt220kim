
public class PentagonalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			System.out.printf("%7d", getPentagonalNumber(i));
			if (i % 10 == 0) 
				System.out.println();
			
		}
	
	}
	public static int  getPentagonalNumber(int n) {
		int number =  (n * (3 * n - 1)) / 2;
		return number;
	}
}
