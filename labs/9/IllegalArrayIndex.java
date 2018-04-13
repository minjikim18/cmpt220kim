import java.util.Scanner;

public class IllegalArrayIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = getArray();
		
		//  Prompt user to enter index of array and check if index is in bounds or out of bounds
		System.out.println("Enter an index of an array: ");
		int index = input.nextInt();
		try {
			System.out.println("The element in index " + index + " is " + array[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}  

	// Method to give us 100 random integers for the array
	private static int[] getArray() {
		int[] array = new int[100]; // JA
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
		return array;
	}

}



