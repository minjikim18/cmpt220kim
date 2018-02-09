import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three numbers
		System.out.print("Enter three numbers: ");
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();

		// Print numbers in increasing order
		displaySortedNumbers(one, two, three);
	}

	// Method to sort numbers
	public static void displaySortedNumbers(
		double one1, double two2, double three3) {
		double temp; 
		
		if (two2 < one1 && two2 < three3){
			temp = one1;
			one1 = two2;
			two2 = temp;
		}
		else if (three3 < one1 && three3 < two2) {
			temp = one1; 
			one1 = three3;
			three3 = temp;
		}
		if (three3 < two2) {
			temp = two2;
			two2 = three3;
			three3 = temp;
		}
		
		// Print result
		System.out.println(one1 + " " + two2 + " " + three3);
	}
}
